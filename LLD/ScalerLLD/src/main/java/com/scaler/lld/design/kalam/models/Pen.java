package com.scaler.lld.design.kalam.models;

public class Pen {
    private String name;
    private String brand;
    private PenType type;
    private Refill refill;
    private Ink ink;
    private Nib nib;

    public void write() {
        switch (type) {
            case GEL :
                System.out.println("Gel pen");
                break;
            case BALL:
                System.out.println("Ball pen");
                break;
            case FOUNTAIN :
                System.out.println("Fountain pen");
                break;
            case MARKER:  break;
        }
        throw new RuntimeException("INvalid Type"+type);
    }
}
