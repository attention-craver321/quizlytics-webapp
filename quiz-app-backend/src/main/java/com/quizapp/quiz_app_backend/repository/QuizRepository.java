package com.quizapp.quiz_app_backend.repository;

import com.quizapp.quiz_app_backend.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {}
