package com.scaler.lld.design.kalam.models;

import com.scaler.lld.design.kalam.interfaces.WritingStrategy;
// strategy pattern step 2 create concrete classes
public class RoughWritingStrategy implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("RoughWritingStrategy");
    }
}
