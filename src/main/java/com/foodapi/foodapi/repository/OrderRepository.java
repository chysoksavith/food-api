package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
