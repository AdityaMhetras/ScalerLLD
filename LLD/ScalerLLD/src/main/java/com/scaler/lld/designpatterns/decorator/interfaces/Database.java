package com.scaler.lld.designpatterns.decorator.interfaces;
//step 1 create product interface
public interface Database {

    String read();

    void write(String value);
}
