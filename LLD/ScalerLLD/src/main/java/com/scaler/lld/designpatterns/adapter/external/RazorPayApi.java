package com.scaler.lld.designpatterns.adapter.external;
//step 1 incompatible interfaces
public class RazorPayApi {

    public void makePayment(String email, String phone) {
        System.out.println("Making payment via Razerpay");
    }

    public RazerPayStatus checkStatus(String paymentId) {
        return RazerPayStatus.SUCCESS;
    }
}
