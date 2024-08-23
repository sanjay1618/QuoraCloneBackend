package com.example.quoraclonebackend.services;

import com.example.quoraclonebackend.models.Topic;
import com.example.quoraclonebackend.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class TopicService implements CommandLineRunner {
    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }
    @Override
    public void run(String... args) throws Exception {
//        Topic topic = Topic.builder()
//                .topicName("Java")
//                .build();
//        topicRepository.save(topic);
//
//        Topic topic1 = Topic.builder()
//                .topicName("Python")
//                .build();
//        topicRepository.save(topic1);
    }
}
