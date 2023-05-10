package com.scaler.lld.design.decorator;

import com.scaler.lld.design.decorator.interfaces.Database;
//step 2 base concrete product impl
public class SimpleDatabase implements Database {
    @Override
    public String read() {
        return "base";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
