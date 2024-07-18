package com.pedro.poc.ms_order.service;

import com.pedro.poc.ms_order.configuration.RabbitMqConfig;
import com.pedro.poc.ms_order.entity.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private RabbitMqConfig rabbitMqConfig;

    public void sendMessage(Order order){
        rabbitTemplate.convertAndSend(rabbitMqConfig.orderQueue().getName(), order);
    }
}
