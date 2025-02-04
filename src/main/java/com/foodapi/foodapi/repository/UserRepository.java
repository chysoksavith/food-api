package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
