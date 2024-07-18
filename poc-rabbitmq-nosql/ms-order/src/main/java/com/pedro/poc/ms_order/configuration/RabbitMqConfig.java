package com.pedro.poc.ms_order.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Value("${queue.order-notification:order-notification-queue}")
    public String orderQueueName;

    @Bean
    public Queue orderQueue() {
        return new Queue(orderQueueName, true);
    }
}
