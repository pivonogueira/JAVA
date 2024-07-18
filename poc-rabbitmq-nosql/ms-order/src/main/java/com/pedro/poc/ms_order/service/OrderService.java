package com.pedro.poc.ms_order.service;

import com.pedro.poc.ms_order.entity.Order;
import com.pedro.poc.ms_order.entity.OrderStatus;
import com.pedro.poc.ms_order.exceptions.ResourceNotFoundException;
import com.pedro.poc.ms_order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private NotificationService notificationService;

    @Transactional
    public Order insertOrder(Order order) {
        double total = order.getItems().stream()
                .mapToDouble(item -> item.getPrice() * item.getQuantity())
                .sum();

        if (total != order.getTotalOrderValue()) {
            throw new IllegalArgumentException("The total order value does not match the sum of the items.");
        }

        try {
            order.setStatus(OrderStatus.ORDER_CREATED);
            order = orderRepository.save(order);
            notificationService.notifyOrderCreation(order);
            return order;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error creating order");
        }

    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
    }

    public Order getOrderByNumber(String orderNumber) {
        return orderRepository.findByOrderNumber(orderNumber);
    }

    public List<Order> getOrderByCustomer(String cpf) {
        return orderRepository.findByCustomerCpf(cpf);
    }
}