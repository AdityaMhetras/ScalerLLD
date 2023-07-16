package com.example.atm.controller;

import com.example.atm.exceptions.NotEnoughBalanceException;
import com.example.atm.service.ATMService;
import com.example.atm.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atmController")
@NoArgsConstructor
@AllArgsConstructor
public class ATMController {

    private ATMService atmService;

    private UserService userService;

    //checkBalance
    @GetMapping("/checkBalance/{userId}/pin/{pin}")
    public Double checkBalance(@PathVariable String userId, @PathVariable int pin) {
        userService.validate(userId, pin);
        return userService.getUserBalance(userId, pin);
    }

    @GetMapping("/withdraw/{userId}/pin/{pin}/amount/{amount}/atmId/{atmId}")
    public boolean withdraw(@PathVariable String userId, @PathVariable int pin, @PathVariable Double amount,
                            @PathVariable String atmId) {

        userService.validate(userId, pin);

        boolean isAmountValid = userService.isAmountValid(userId, pin, amount);

        if(!isAmountValid) {
            throw new NotEnoughBalanceException("You do not have enough balance");
        }

        boolean isWithdrawSuccessful = atmService.withDraw(userId, pin, amount, atmId);

        return isWithdrawSuccessful;
    }


}
