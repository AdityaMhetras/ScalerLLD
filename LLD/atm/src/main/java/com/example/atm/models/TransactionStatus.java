package com.example.atm.models;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransactionStatus {

    IN_PROGRESS("In progress"),
    SUCCESSFUL("Successful"),
    FAILED("Failed"),
    OUT_OF_MONEY("Out of money");

    private String val;

    TransactionStatus(String val) {
        this.val = val;
    }

    @JsonValue
    public String getVal() {
        return val;
    }
}
