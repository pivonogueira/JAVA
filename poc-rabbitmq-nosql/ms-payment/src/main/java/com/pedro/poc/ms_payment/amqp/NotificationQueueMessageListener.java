package com.pedro.poc.ms_payment.amqp;

import com.pedro.poc.ms_payment.dto.OrderDTO;
import com.pedro.poc.ms_payment.service.PaymentsService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NotificationQueueMessageListener {

    @Autowired
    private PaymentsService paymentsService;

    @Transactional
    @RabbitListener(queues = "${queue.payment-notification:payment-notification-queue}")
    public void receiveOrderStatusUpdate(OrderDTO order) {
        paymentsService.updateOrderStatus(order);
    }
}

