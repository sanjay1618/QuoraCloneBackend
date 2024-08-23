package com.example.quoraclonebackend.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionRequestDTO {

    private String title;
    private String description;
    private List<Long> topicIds;
    private Long id;

}
