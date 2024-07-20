package com.pedro.poc.ms_payment.dto;

import com.pedro.poc.ms_payment.entity.OrderStatus;
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
    private double totalOrderValue;
    private OrderStatus status;
}
