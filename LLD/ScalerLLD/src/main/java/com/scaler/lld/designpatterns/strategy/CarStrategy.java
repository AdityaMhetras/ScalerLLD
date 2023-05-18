package com.scaler.lld.designpatterns.strategy;
// Step 2 create concrete strategy classes

import com.scaler.lld.designpatterns.strategy.interfaces.NavigationStrategy;

public class CarStrategy implements NavigationStrategy {
    @Override
    public void navigate(String source, String destination) {
        System.out.println("car route");
    }
}
