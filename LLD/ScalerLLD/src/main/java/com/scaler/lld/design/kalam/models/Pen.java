package com.scaler.lld.design.kalam.models;

public abstract class Pen {
    private String name;
    private String brand;
    private PenType type;

    public abstract void write();
    public abstract void changeRefill(Refill refill);
}
