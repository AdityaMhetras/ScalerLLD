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

    public User user(String hashedPassword) {
        User user = new User();
        user.setName(this.name);
        user.setPhoneNumber(this.phoneNumber);
        user.setHashedPassword(hashedPassword);
        return user;
    }
}
