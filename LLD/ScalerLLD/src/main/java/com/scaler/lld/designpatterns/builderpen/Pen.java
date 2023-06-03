package com.scaler.lld.designpatterns.builderpen;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Pen {
    private String refill;
    private String grip;
    private String cap;

    public Pen (String refill, String grip, String cap) {
        if(refill == null) {
            throw new RuntimeException("refill cannot be null");
        }
        this.refill = refill;
        this.grip = grip;
        this.cap = cap;
    }
}
