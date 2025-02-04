package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
