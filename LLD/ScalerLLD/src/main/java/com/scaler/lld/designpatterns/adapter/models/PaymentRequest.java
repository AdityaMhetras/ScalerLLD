package com.scaler.lld.designpatterns.adapter.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PaymentRequest {
    private String phoneNumber;
    private String email;
    private String name;
    private Double amount;


}
