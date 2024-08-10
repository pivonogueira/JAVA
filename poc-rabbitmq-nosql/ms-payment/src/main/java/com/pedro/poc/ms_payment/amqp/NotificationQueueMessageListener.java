package com.pedro.poc.ms_payment.amqp;

import com.pedro.poc.ms_payment.dto.OrderDTO;
import com.pedro.poc.ms_payment.service.PaymentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class NotificationQueueMessageListener {

    @Autowired
    private PaymentsService paymentsService;

    @Transactional
    @RabbitListener(queues = "${queue.order-notification:order-notification-queue}")
    public void receiveOrderStatusUpdate(OrderDTO message) {
        log.info("Received message to update order status: CPF: {}, total value {}", message.getCustomerCpf(), message.getTotalOrderValue());
        paymentsService.updateOrderStatus(message);
        log.info("Message processed successfully");
    }
}

