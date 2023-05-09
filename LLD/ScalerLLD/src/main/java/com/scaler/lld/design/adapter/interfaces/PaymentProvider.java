package com.scaler.lld.design.adapter.interfaces;

import com.scaler.lld.design.adapter.models.PaymentRequest;
import com.scaler.lld.design.adapter.models.PaymentStatus;

//step 2 create adapter interfaces
public interface PaymentProvider {
    public void createPayment(PaymentRequest request);

    public PaymentStatus verifyStatus(String paymentId);
}
