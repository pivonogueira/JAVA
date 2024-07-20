package com.pedro.poc.ms_order.dto;

import com.pedro.poc.ms_order.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderDTO {

    private Long id;
    private String customerCpf;
    private double total;
    private OrderStatus status;
}
