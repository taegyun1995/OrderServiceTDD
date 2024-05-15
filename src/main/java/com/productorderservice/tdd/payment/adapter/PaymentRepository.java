package com.productorderservice.tdd.payment.adapter;

import com.productorderservice.tdd.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<Payment, Long> {

}