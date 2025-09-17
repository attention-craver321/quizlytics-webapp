package com.quizapp.quiz_app_backend.repository;

import com.quizapp.quiz_app_backend.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {}
