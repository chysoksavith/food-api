package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
