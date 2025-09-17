package com.quizapp.quiz_app_backend.repository;

import com.quizapp.quiz_app_backend.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {}
