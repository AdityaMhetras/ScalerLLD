package com.scaler.splitwise.dtos;

import com.scaler.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GetUserDTO {

    private String name;
    private String phoneNumber;

    public static GetUserDTO from(User user) {
        return new GetUserDTO(user.getName(), user.getPhoneNumber());
    }
}
