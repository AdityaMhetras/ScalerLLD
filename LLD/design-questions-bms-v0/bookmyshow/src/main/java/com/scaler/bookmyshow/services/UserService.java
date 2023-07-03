package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(String id) {
        System.out.println("Fetching user with id "+id);
        return null;
    }

    public User createUser(User user) {
        System.out.println("Creating user with email: "+user.getEmail());
        return null;
    }
}
