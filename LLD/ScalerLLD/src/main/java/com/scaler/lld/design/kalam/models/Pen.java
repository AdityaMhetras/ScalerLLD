package com.scaler.lld.design.kalam.models;

import com.scaler.lld.design.kalam.interfaces.WritingStrategy;
//strategy pattern step 3 use strategy on context class

public abstract class Pen {
    private String name;
    private String brand;
    private PenType type;
    private WritingStrategy strategy;

    public void write() {
        strategy.write();
    }
    public abstract void changeRefill(Refill refill);
}
