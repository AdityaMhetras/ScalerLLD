package com.scaler.lld.design.kalam.models;

public class GelPen extends Pen{
    private Refill refill;
    @Override
    public void write() {
        System.out.println("Writing with gel pen");
    }

    @Override
    public void changeRefill(Refill refill) {
        if (this.refill.getRefillable()) {
            this.refill = refill;
        }
    }
}
