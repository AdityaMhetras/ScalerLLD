package com.scaler.bookmyshow.controller;

import com.scaler.bookmyshow.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}

// 2. setter injection
// add setter
