package com.example.quoraclonebackend.services;

import com.example.quoraclonebackend.models.Question;
import com.example.quoraclonebackend.models.Topic;
import com.example.quoraclonebackend.models.User;
import com.example.quoraclonebackend.repository.QuestionRepository;
import com.example.quoraclonebackend.repository.TopicRepository;
import com.example.quoraclonebackend.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class service1 implements CommandLineRunner {

    UserRepository userRepository;
    QuestionRepository questionRepository;
    TopicRepository topicRepository;

    public service1(UserRepository userRepository, QuestionRepository questionRepository, TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
        this.questionRepository = questionRepository;
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .username("Sanjay")
                .email("sanjay.uppugandla@gmail.com")
                .bio("I am a passionate software Developer")
                .build();
        userRepository.save(user);

    }

}
