package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
