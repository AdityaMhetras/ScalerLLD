package com.scaler.bookmyshow.controller;

import com.scaler.bookmyshow.dtos.CreateUserDto;
import com.scaler.bookmyshow.exceptions.InvalidEmailException;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController// tells spring this is a component
@AllArgsConstructor // ctor user for injection
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    // get a user
    // verb - endpoint
    // GET - /user/{id}

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    // create a user
    // Verb - endpoint
    // POSt - /user
    @PostMapping("/")
    public User createUser(@RequestBody CreateUserDto request) {
        // 1. Data validation
        validate(request);

        // 2. Data transformation
        User user = request.toUser();
        return userService.createUser(user);
    }

    private void validate(CreateUserDto request) {
        if (request.getEmail() == null) {
            throw new InvalidEmailException("Email is not present");
        }
    }

}

// 1. ctor injection
// add ctor

// 2. setter injection
// add setter

// 3. field injection
// @Autowired
