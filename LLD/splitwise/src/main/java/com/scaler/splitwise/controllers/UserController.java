package com.scaler.splitwise.controllers;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.GetUserDTO;
import com.scaler.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor // for constructor injection
public class UserController {

    private UserService userService;

    @PostMapping("/")
    public GetUserDTO createUser(@RequestBody CreateUserDTO request) {
        // validation
        validate(request);
        return userService.createUser(request).dto();
    }

    private void validate(CreateUserDTO request) {
        if (request.getHashedPassword() == null) {
            throw new RuntimeException("Empty Password");
        }
    }
}
