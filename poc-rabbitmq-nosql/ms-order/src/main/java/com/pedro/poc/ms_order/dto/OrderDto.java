package com.pedro.poc.ms_order.dto;

import com.pedro.poc.ms_order.entity.OrderItem;
import com.pedro.poc.ms_order.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OrderDto {

    private Long id;
    private String orderNumber;
    private String customerCpf;
    private List<OrderItem> items;
    private double total;
    private OrderStatus status;


}
