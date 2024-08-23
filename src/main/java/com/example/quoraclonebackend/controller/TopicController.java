package com.example.quoraclonebackend.controller;

import com.example.quoraclonebackend.models.Topic;
import com.example.quoraclonebackend.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TopicController {

    TopicService topicService;
    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping("/topics")
    public Topic createTopic(@RequestBody Topic topic) {
        System.out.println(topic.getTopicName());
        return topicService.createTopic(topic);

    }

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

}
