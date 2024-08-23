package com.example.quoraclonebackend.repository;

import com.example.quoraclonebackend.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
