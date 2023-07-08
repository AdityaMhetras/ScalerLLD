package com.scaler.splitwise.dtos;

import com.scaler.splitwise.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // jackson needs for serialization
@Getter
public class CreateUserDTO {
    private String name;
    private String phoneNumber;
    private String hashedPassword;

    public User user() {
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setHashedPassword(hashedPassword);
        return user;
    }
}
