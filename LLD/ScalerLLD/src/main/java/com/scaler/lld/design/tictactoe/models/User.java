package com.scaler.lld.design.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String name;
    private String email;
    private Byte[] photo;
}
