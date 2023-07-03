package com.scaler.bookmyshow.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user1")
public class User extends BaseModel {
    private String email;

    public User(Long id, Date createdAt, Date updatedAt, String email) {
        super(id, createdAt, updatedAt);
        this.email = email;
    }
}

