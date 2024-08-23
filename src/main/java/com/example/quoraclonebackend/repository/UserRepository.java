package com.example.quoraclonebackend.repository;

import com.example.quoraclonebackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
