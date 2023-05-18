package com.scaler.lld.designpatterns.adapter;

import com.scaler.lld.designpatterns.adapter.interfaces.PaymentProvider;
import com.scaler.lld.designpatterns.adapter.models.PaymentRequest;
import com.scaler.lld.designpatterns.adapter.models.PaymentStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PaymentProviderTest {

    private PaymentProvider provider;

    @Before
    public void setup() {
        provider = new StripeProvider();
    }

    @Test
    public void testPayment() {
        Assert.assertTrue("if stripe is used, instance should be of StripeProvider", provider instanceof StripeProvider);
        provider.createPayment(PaymentRequest.builder()
                .email("tester@email")
                .build());
    }

    @Test
    public void testStatus() {
        PaymentStatus status = provider.verifyStatus("abc");
        Assert.assertEquals("if status is called, OK should be returned", PaymentStatus.SUCCESS, status);
    }
}
