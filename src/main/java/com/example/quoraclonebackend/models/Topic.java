package com.example.quoraclonebackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Topic extends BaseModel{

    @Column(nullable = false, unique = true)
    private String topicName;

    @ManyToMany(mappedBy="topics")
    @JsonIgnore
    private List<Question> questions;
}
