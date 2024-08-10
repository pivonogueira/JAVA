package com.pedro.poc.ms_order.amqp;

import com.pedro.poc.ms_order.dto.OrderDTO;
import com.pedro.poc.ms_order.entity.Order;
import com.pedro.poc.ms_order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
public class PaymentQueueMessageListener {

    @Autowired
    private OrderService orderService;

    @Transactional
    @RabbitListener(queues = "${queue.payment-notification:payment-notification-queue}")
    public void receiveOrderStatusUpdate(OrderDTO message) {
        log.info("Received message to update order status: CPF: {}, total value {}", message.getCustomerCpf(), message.getTotalOrderValue());
        Order existingOrder = orderService.verifyExistOrder(message.getId());
        orderService.updateOrderStatus(existingOrder, message.getStatus());
        log.info("Message processed successfully");
    }

}
