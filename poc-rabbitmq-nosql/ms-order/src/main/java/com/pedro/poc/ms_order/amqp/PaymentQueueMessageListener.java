package com.pedro.poc.ms_order.amqp;

import com.pedro.poc.ms_order.dto.OrderDto;
import com.pedro.poc.ms_order.entity.Order;
import com.pedro.poc.ms_order.exceptions.ResourceNotFoundException;
import com.pedro.poc.ms_order.repository.OrderRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PaymentListener {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    @RabbitListener(queues = "${queue.payment-notification:payment-notification-queue}")
    public void receiveOrderStatusUpdate(OrderDto order) {
        Order existingOrder = orderRepository.findById(order.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + order.getId()));

        existingOrder.setStatus(order.getStatus());
        orderRepository.save(existingOrder);
    }
}
