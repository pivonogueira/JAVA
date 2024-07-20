package com.pedro.poc.ms_order.service;

import com.pedro.poc.ms_order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationServiceQueueMessageProducer {

    @Autowired
    MessageProducer messageProducer;

    public void notifyOrderCreation(OrderDTO order) {
        messageProducer.sendMessage(order);
        log.info("Send order to payment: costumer CPF: {}, total value: {}", order.getCustomerCpf(), order.getTotal());
    }
}
