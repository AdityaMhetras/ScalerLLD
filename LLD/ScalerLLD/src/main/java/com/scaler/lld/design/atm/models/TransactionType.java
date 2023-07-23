package com.scaler.lld.design.atm.models;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransactionType {

    CHECK_BALANCE("Check balance"),
    WITHDRAW("Withdraw"),
    DEPOSIT_CASH("Deposit cash"),
    DEPOSIT_CHEQUE("Deposit cheque");

    private String val;

    TransactionType(String val) {
        this.val = val;
    }

    @JsonValue
    public String getVal() {
        return val;
    }

}
