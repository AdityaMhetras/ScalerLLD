package com.scaler.lld.design.strategy;

import org.junit.Test;

public class NavigationStrategyTest {

    @Test
    public void testCarStrategy() {

        Navigator navigator = new Navigator(new CarStrategy());
        navigator.navigateTo(null,null);
    }

    @Test
    public void testBikeStrategy() {

        Navigator navigator = new Navigator(new BikeStrategy());
        navigator.navigateTo(null,null);
    }
}
