package com.pedro.poc.ms_order.service;

import com.pedro.poc.ms_order.dto.OrderDTO;
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
    private NotificationServiceQueueMessageProducer notificationService;

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
            notificationService.notifyOrderCreation(buildOrderDto(order));
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

    private OrderDTO buildOrderDto(Order order) {

        return OrderDTO.builder()
                .id(order.getId())
                .customerCpf(order.getCustomerCpf())
                .total(order.getTotalOrderValue())
                .status(order.getStatus())
                .build();
    }

    public Order verifyExistOrder(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + orderId));

    }

    public void updateOrderStatus(Order existingOrder, OrderStatus newStatus) {
        existingOrder.setStatus(newStatus);
        orderRepository.save(existingOrder);
    }
}