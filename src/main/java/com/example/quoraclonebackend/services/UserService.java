package com.example.quoraclonebackend.services;

import com.example.quoraclonebackend.models.User;
import com.example.quoraclonebackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User updateUser(Long id, User user) {
        User userById = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"+id));
        userById.setUsername(user.getUsername());
        userById.setEmail(user.getEmail());
        return userRepository.save(userById);
    }
}
