package com.pedro.poc.ms_payment.controller;

import com.pedro.poc.ms_payment.entity.Payment;
import com.pedro.poc.ms_payment.service.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentsService paymentsService;

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id) {
        return ResponseEntity.ok(paymentsService.getPayment(id));
    }

    @GetMapping("/customer/{customerCpf}")
    public ResponseEntity<List<Payment>> getOrderByCustomer(@PathVariable String customerCpf) {
        return ResponseEntity.ok(paymentsService.getOrderByCustomer(customerCpf));
    }
}
