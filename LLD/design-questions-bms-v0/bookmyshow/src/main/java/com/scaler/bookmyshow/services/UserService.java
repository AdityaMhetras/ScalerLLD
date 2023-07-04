package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    public User getUser(Long id) {
        System.out.println("Fetching user with id "+id);
        return null;
    }

    public User createUser(User user) {
        System.out.println("Creating user with email: "+user.getEmail());
        return userRepository.save(user);
    }
}
