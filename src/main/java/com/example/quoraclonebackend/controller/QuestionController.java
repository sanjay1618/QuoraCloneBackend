package com.example.quoraclonebackend.controller;

import com.example.quoraclonebackend.DTO.QuestionRequestDTO;
import com.example.quoraclonebackend.models.Question;
import com.example.quoraclonebackend.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QuestionController {
    QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/questions")
    public Question createQuestion(@RequestBody QuestionRequestDTO questionRequestDTO){
        return questionService.createQuestion(questionRequestDTO);

    }
}
