package com.scaler.lld.design.kalam.models;

import lombok.Getter;

@Getter
public class Refill {
    private Double radius;
    private Boolean refillable;
    private RefillType refillType;
    private Ink ink;
    private Nib nib;
}
