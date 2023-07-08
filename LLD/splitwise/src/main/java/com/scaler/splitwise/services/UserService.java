package com.scaler.splitwise.services;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User createUser(CreateUserDTO request) {
        // 1. Map DTO to model
        User user = request.user();
        // 1.5 excryption/encode (Hash the password)
        // 2. store in db
        return userRepository.save(user);
    }
}
