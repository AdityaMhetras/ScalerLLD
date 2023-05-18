package com.scaler.lld.designpatterns.adapter.interfaces;

import com.scaler.lld.designpatterns.adapter.models.PaymentRequest;
import com.scaler.lld.designpatterns.adapter.models.PaymentStatus;

//step 2 create adapter interfaces
public interface PaymentProvider {
    public void createPayment(PaymentRequest request);

    public PaymentStatus verifyStatus(String paymentId);
}
