package com.quizapp.quiz_app_backend.service;

import com.quizapp.quiz_app_backend.model.*;
import com.quizapp.quiz_app_backend.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository quizRepository;
    private final AttemptRepository attemptRepository;

    public QuizService(QuizRepository quizRepository, AttemptRepository attemptRepository) {
        this.quizRepository = quizRepository;
        this.attemptRepository = attemptRepository;
    }

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Attempt saveAttempt(Attempt attempt) {
        return attemptRepository.save(attempt);
    }
}

