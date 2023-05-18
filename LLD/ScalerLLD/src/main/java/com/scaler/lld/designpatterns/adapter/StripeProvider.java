package com.scaler.lld.designpatterns.adapter;

import com.scaler.lld.designpatterns.adapter.external.StripeApi;
import com.scaler.lld.designpatterns.adapter.external.StripeStatus;
import com.scaler.lld.designpatterns.adapter.interfaces.PaymentProvider;
import com.scaler.lld.designpatterns.adapter.models.PaymentRequest;
import com.scaler.lld.designpatterns.adapter.models.PaymentStatus;

//step 3 concrete adapters
public class StripeProvider implements PaymentProvider {
    private StripeApi api = new StripeApi();
    @Override
    public void createPayment(PaymentRequest request) {
        api.payAmount(request.getEmail());
    }

    @Override
    public PaymentStatus verifyStatus(String paymentId) {
        StripeStatus stripeStatus = api.status(paymentId);
        return toStatus(stripeStatus);
    }

    private PaymentStatus toStatus(StripeStatus stripeStatus) {
        if(stripeStatus == StripeStatus.OK){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.ERROR;
    }
}
