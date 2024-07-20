package com.pedro.poc.ms_payment.service;

import com.pedro.poc.ms_payment.dto.OrderDTO;
import com.pedro.poc.ms_payment.entity.OrderStatus;
import com.pedro.poc.ms_payment.entity.Payment;
import com.pedro.poc.ms_payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PaymentsService {

    private static final double MAX_ORDER_VALUE = 1000.0;

    @Autowired
    PaymentRepository repository;

    @Autowired
    PaymentServiceQueueMessageProducer messageProducer;

    @Transactional
    public void updateOrderStatus(OrderDTO order) {
        Payment paymentOrder = createPaymentOrder(order);

        if (paymentOrder.getTotalOrderValue() >= MAX_ORDER_VALUE) {
            paymentOrder.setStatus(OrderStatus.PAYMENT_REJECTED);
        }
        if (paymentOrder.getTotalOrderValue() < MAX_ORDER_VALUE) {
            paymentOrder.setStatus(OrderStatus.CONFIRM_PAYMENT);
        }
        repository.save(paymentOrder);
        messageProducer.notifyOrderCreation(createOrderDto(paymentOrder));

    }

    public Payment getPayment(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Payment not found"));
    }

    public List<Payment> getOrderByCustomer(String customerCpf) {
        return repository.findByCustomerCpf(customerCpf);
    }

    private OrderDTO createOrderDto(Payment paymentOrder) {
        return OrderDTO.builder()
                .id(paymentOrder.getId())
                .customerCpf(paymentOrder.getCustomerCpf())
                .totalOrderValue(paymentOrder.getTotalOrderValue())
                .build();
    }

    private Payment createPaymentOrder(OrderDTO order) {
        return Payment.builder()
                .id(order.getId())
                .customerCpf(order.getCustomerCpf())
                .totalOrderValue(order.getTotalOrderValue())
                .build();
    }
}
