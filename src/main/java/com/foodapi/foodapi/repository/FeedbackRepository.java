package com.foodapi.foodapi.repository;

import com.foodapi.foodapi.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
