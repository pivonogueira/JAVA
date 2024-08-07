package com.pedro.poc.ms_order.amqp;

import com.pedro.poc.ms_order.dto.OrderDTO;
import com.pedro.poc.ms_order.entity.Order;
import com.pedro.poc.ms_order.service.OrderService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PaymentQueueMessageListener {

    @Autowired
    private OrderService orderService;

    @Transactional
    @RabbitListener(queues = "${queue.payment-notification:payment-notification-queue}")
    public void receiveOrderStatusUpdate(OrderDTO order) {
        Order existingOrder = orderService.verifyExistOrder(order.getId());
        orderService.updateOrderStatus(existingOrder, order.getStatus());
    }

}
