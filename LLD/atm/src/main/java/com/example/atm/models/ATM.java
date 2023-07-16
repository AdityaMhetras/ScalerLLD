package com.example.atm.models;

import com.example.atm.exceptions.InsufficientFundsException;
import com.example.atm.exceptions.NotEnoughBalanceException;
import com.example.atm.service.ATMService;
import com.example.atm.service.UserService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class ATM {

    private String id;
    private Location location;
    private CurrencyComposition composition;
    private Double balance = 0.0;
    private ATMStatus status;
    private List<Transaction> transactions = new ArrayList<>();

    @Autowired
    private UserService userService;

    @Autowired
    private ATMService atmService;

    public ATM(String id, Location location, CurrencyComposition composition) {
        this.id = id;
        this.location = location;
        this.composition = composition;
        this.balance = Double.valueOf(composition.getAtmBalance());
        this.status = ATMStatus.ACTIVE;
    }


}
