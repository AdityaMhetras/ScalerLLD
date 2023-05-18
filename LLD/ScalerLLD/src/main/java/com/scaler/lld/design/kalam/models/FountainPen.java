package com.scaler.lld.design.kalam.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FountainPen extends Pen{
    private Ink ink;
    private Nib nib;
    @Override
    public void write() {
        System.out.println("Writing with fountain pen");
    }

    @Override
    public void changeRefill(Refill refill) {
        //liskov principle broken
        throw new UnsupportedOperationException("Fountain pen cannot be refilled");
    }

    public void changeInk(Ink ink) {
        this.ink = ink;
    }
}
