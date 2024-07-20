package com.pedro.poc.ms_payment.service;

import com.pedro.poc.ms_payment.configuration.RabbitMqConfig;
import com.pedro.poc.ms_payment.dto.OrderDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitMqConfig rabbitMqConfig;

    public void sendOrderQueueMessage(OrderDTO order){
        rabbitTemplate.convertAndSend(rabbitMqConfig.orderQueue().getName(), order);
    }
}
