package com.scaler.bookmyshow.controller;

import com.scaler.bookmyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {


    private UserService userService;


}

// 1. ctor injection
// add ctor

