package com.pedro.poc.ms_payment.service;

import com.pedro.poc.ms_payment.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PaymentServiceQueueMessageProducer extends MessageProducer{

    @Autowired
    MessageProducer messageProducer;

    public void notifyOrderCreation(OrderDTO order) {
        messageProducer.sendOrderQueueMessage(order);
        log.info("Send payment status to order: costumer CPF: {}, payment status: {}", order.getCustomerCpf(), order.getStatus());
    }
}

