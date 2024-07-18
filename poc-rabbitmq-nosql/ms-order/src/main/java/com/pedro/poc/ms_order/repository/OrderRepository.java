package com.pedro.poc.ms_order.repository;

import com.pedro.poc.ms_order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByOrderNumber(String orderNumber);
    List<Order> findByCustomerCpf(String customerCpf);
}
