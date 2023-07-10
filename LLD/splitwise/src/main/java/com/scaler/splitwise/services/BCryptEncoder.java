package com.scaler.splitwise.services;

import com.scaler.splitwise.services.interfaces.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptEncoder implements PasswordEncoder {

    // why not directly use spring class? ans: decouple spring's class and make it maintainable
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Override
    public String encode(String plainText) {
        return bCryptPasswordEncoder.encode(plainText);
    }

    @Override
    public boolean matches(String plainText, String encodedPassword) {
        return bCryptPasswordEncoder.matches(plainText, encodedPassword);
    }
}
