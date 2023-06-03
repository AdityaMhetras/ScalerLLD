package com.scaler.lld.designpatterns.builderpen;

import org.junit.Assert;
import org.junit.Test;

public class KalamTest {

    @Test(expected = RuntimeException.class)
    public void testKalam() {
        Kalam kalam = Kalam.builder().withRefill("null").build();
        Assert.assertEquals("if kalam object is created, value of refill is REFILL", "REFILL", kalam.getRefill());
    }

    @Test
    public void testKalamRefill() {
        Kalam kalam = Kalam.builder()
                .withRefill("REFILL")
                .withGrip("CELLO")
                .withCap("CAP")
                .build();
        Assert.assertEquals("if kalam object is created, value of refill is REFILL", "REFILL", kalam.getRefill());
    }

}
