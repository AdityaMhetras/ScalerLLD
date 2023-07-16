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
    private  long id;

    private String atmId;

    private Long cardNumber;

    private LocalDateTime transactionTime;

    private TransactionType type;

    private TransactionStatus status;

    private UserAccount user;

    private Long amount;

    public Transaction(String atmId, Long cardNumber, TransactionType type, UserAccount user, Long amount) {
        this.transactionTime = LocalDateTime.now();
        this.atmId = atmId;
        this.cardNumber = cardNumber;
        this.type = type;
        this.user = user;
        this.amount = amount;
        this.status = IN_PROGRESS;
    }
}
