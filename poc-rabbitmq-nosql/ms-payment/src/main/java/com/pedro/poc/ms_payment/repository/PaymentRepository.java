package com.pedro.poc.ms_payment.repository;

import com.pedro.poc.ms_payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByCustomerCpf(String customerCpf);

}
