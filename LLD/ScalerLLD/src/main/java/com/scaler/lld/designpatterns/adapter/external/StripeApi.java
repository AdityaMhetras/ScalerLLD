package com.scaler.lld.designpatterns.adapter.external;

//step 1 incompatible interfaces
public class StripeApi {

    public void payAmount(String email) {
        System.out.println("Making payment via Stripe");
    }

    public StripeStatus status(String paymentId) {
        return StripeStatus.OK;
    }
}
