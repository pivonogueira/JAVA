package com.pedro.poc.ms_order.service;

import com.pedro.poc.ms_order.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    @Autowired
    MessageProducer messageProducer;


    public void notifyOrderCreation(Order order) {
        messageProducer.sendMessage(order);
        log.info("Send order to payment: {}, costumer CPF: {}, total value: {}", order.getOrderNumber(), order.getCustomerCpf(), order.getTotalOrderValue());
    }
}
