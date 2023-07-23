package com.scaler.lld.design.atm.models;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ATMStatus {

    ACTIVE("Active"),
    TECHNICAL_ERROR("Technical Error"),
    OUT_OF_BALANCE("Out of balance"),
    ABANDONED("Abandoned");

    private String val;

    ATMStatus(String val) {
        this.val = val;
    }

    @JsonValue
    public String getVal() {
        return val;
    }
}
