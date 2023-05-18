package com.scaler.lld.designpatterns.observer;

import com.scaler.lld.designpatterns.observer.interfaces.BitcoinTracker;
import com.scaler.lld.designpatterns.observer.models.Bitcoin;
import org.junit.Before;
import org.junit.Test;

public class BitcoinTrackerTest {

    private BitcoinTracker bitcoinTracker;

    @Before
    public void setUp() {
        bitcoinTracker = new BitcoinTracker(Bitcoin.builder().value(16000.0).build());
        bitcoinTracker.subscribe(new EmailService());
    }

    @Test
    public void testPriceChange() {
        bitcoinTracker.setPrice(17000.0);
    }
}
