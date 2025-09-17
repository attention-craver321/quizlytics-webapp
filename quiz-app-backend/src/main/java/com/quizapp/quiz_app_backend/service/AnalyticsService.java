package com.quizapp.quiz_app_backend.service;

import com.quizapp.quiz_app_backend.model.Attempt;
import com.quizapp.quiz_app_backend.repository.AttemptRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AnalyticsService {
    private final AttemptRepository attemptRepository;

    public AnalyticsService(AttemptRepository attemptRepository) {
        this.attemptRepository = attemptRepository;
    }

    public Map<String, Long> findWeakAreas(Long userId) {
        List<Attempt> attempts = attemptRepository.findAll();
        return attempts.stream()
                .filter(a -> a.getUser().getId().equals(userId))
                .flatMap(a -> a.getQuestionResults().entrySet().stream())
                .filter(entry -> !entry.getValue())
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.counting()));
    }
}

