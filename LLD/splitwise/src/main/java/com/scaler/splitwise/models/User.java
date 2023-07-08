package com.scaler.splitwise.models;

import com.scaler.splitwise.dtos.GetUserDTO;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Setter
public class User extends BaseModel {
    private String name;
    private String phoneNumber;
    private String hashedPassword;

    public GetUserDTO dto() {
        return new GetUserDTO(name, phoneNumber);
    }
}
