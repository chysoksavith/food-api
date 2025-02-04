package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
