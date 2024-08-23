package com.example.quoraclonebackend.repository;

import com.example.quoraclonebackend.models.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
