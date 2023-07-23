package com.scaler.lld.design.atm.service;

import com.example.atm.exceptions.InvalidPinException;

public class UserService {
    public void validate(String account, int pin) {
        // check if pin is valid
        boolean isPinValid = true;
        if( !isPinValid ) {
            throw new InvalidPinException("User pin is invalid");
        }
    }

    public Double getUserBalance(String userId, int pin) {
        return 0.0;
    }

    public boolean isAmountValid(String userId, int pin, Double amount) {
        if( getUserBalance(userId, pin) >= amount) {
            return true;
        }
        return false;
    }
}
