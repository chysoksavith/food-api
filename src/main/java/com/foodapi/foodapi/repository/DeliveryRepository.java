package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
