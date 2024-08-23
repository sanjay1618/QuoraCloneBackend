package com.example.quoraclonebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class QuoraCloneBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuoraCloneBackendApplication.class, args);
    }

}
