package com.scaler.lld.designpatterns.strategy;

import com.scaler.lld.designpatterns.strategy.interfaces.NavigationStrategy;

// Step 2 create concrete strategy classes
public class BikeStrategy implements NavigationStrategy {
    @Override
    public void navigate(String source, String destination) {
        System.out.println("bike route");
    }
}
