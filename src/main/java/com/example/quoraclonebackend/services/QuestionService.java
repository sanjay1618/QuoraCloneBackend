package com.example.quoraclonebackend.services;

import com.example.quoraclonebackend.DTO.QuestionRequestDTO;
import com.example.quoraclonebackend.models.Question;
import com.example.quoraclonebackend.models.Topic;
import com.example.quoraclonebackend.models.User;
import com.example.quoraclonebackend.repository.QuestionRepository;
import com.example.quoraclonebackend.repository.TopicRepository;
import com.example.quoraclonebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final TopicRepository topicRepository;
    private final QuestionRequestDTO questionRequestDTO;
    private final UserRepository userRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository, TopicRepository topicRepository, QuestionRequestDTO questionRequestDTO,UserRepository userRepository) {
        this.questionRepository = questionRepository;
        this.topicRepository = topicRepository;
        this.questionRequestDTO = questionRequestDTO;
        this.userRepository = userRepository;

    }

    public Question createQuestion(QuestionRequestDTO questionRequestDTO) {

        List<Long> topics1 = questionRequestDTO.getTopicIds();
        System.out.println(topics1.toString());
        List<Topic> topic = topicRepository.findAllById(questionRequestDTO.getTopicIds()) ;

        User user = userRepository.findById(questionRequestDTO.getId())
                .orElseThrow(() -> new RuntimeException("User not found with id " + questionRequestDTO.getId()));

        Question question = Question.builder()
                .title(questionRequestDTO.getTitle())
                .description(questionRequestDTO.getDescription())
                .user(user)
                .topics(topic)
                .build();
        Question questionSaved = questionRepository.save(question);
        System.out.println(questionSaved.getUser().getId());
        return questionSaved;
    }

}
