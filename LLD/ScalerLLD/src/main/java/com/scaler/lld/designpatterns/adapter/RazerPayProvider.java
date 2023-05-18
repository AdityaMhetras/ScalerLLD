package com.scaler.lld.designpatterns.adapter;

import com.scaler.lld.designpatterns.adapter.external.RazerPayStatus;
import com.scaler.lld.designpatterns.adapter.external.RazorPayApi;
import com.scaler.lld.designpatterns.adapter.interfaces.PaymentProvider;
import com.scaler.lld.designpatterns.adapter.models.PaymentRequest;
import com.scaler.lld.designpatterns.adapter.models.PaymentStatus;

//step 3 concrete adapters
public class RazerPayProvider implements PaymentProvider {
    private RazorPayApi api = new RazorPayApi();
    @Override
    public void createPayment(PaymentRequest request) {
        api.makePayment(request.getEmail(),request.getPhoneNumber());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        RazerPayStatus razerPayStatus = api.checkStatus(paymentId);
        return toStatus(razerPayStatus);
    }

    private PaymentStatus toStatus(RazerPayStatus razerPayStatus) {
        if(razerPayStatus==RazerPayStatus.SUCCESS) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.ERROR;
    }
}
