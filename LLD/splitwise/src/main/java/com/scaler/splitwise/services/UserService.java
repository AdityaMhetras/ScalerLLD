package com.scaler.splitwise.services;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.UserRepository;
import com.scaler.splitwise.services.interfaces.PasswordEncoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public User createUser(CreateUserDTO request) {

        // 1 encryption/encode (Hash the password)
        String hashedPassword = passwordEncoder.encode(request.getHashedPassword());

        // 2. Map DTO to model
        User user = request.user(hashedPassword);

        // 3. store in db
        return userRepository.save(user);
    }
}
