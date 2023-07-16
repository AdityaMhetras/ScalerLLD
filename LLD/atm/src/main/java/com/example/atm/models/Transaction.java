package com.example.atm.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static com.example.atm.models.TransactionStatus.IN_PROGRESS;

@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private long id;

    private String atmId;


    private LocalDateTime transactionTime;

    private TransactionType type;

    private TransactionStatus status;

    private String userId;

    private Double amount;

    public Transaction(String atmId, TransactionType type, String userId, Double amount) {
        this.transactionTime = LocalDateTime.now();
        this.atmId = atmId;
        this.type = type;
        this.userId = userId;
        this.amount = amount;
        this.status = IN_PROGRESS;
    }
}
