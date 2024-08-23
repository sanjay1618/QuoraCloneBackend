package com.example.quoraclonebackend.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question extends BaseModel{

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "topic_question",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "topic_id")
    )
    @JsonManagedReference
    private List<Topic> topics;

    @ManyToOne
    private User user;

}
