package com.pedro.poc.ms_payment.repository;

import com.pedro.poc.ms_payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByCustomerCpf(String customerCpf);

}
