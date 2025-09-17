package com.quizapp.quiz_app_backend.controller;

import com.quizapp.quiz_app_backend.model.*;
import com.quizapp.quiz_app_backend.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    private final QuizService quizService;
    public QuizController(QuizService quizService) { this.quizService = quizService; }

    @PostMapping("/create")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.createQuiz(quiz);
    }

    @GetMapping("/all")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @PostMapping("/submit")
    public Attempt submitAttempt(@RequestBody Attempt attempt) {
        attempt.setTimestamp(LocalDateTime.now());
        return quizService.saveAttempt(attempt);
    }
}


