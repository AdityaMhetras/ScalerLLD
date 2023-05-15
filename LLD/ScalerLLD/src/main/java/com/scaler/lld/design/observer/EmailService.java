package com.scaler.lld.design.observer;

import com.scaler.lld.design.observer.interfaces.Observer;

public class EmailService implements Observer {

    @Override
    public void consume() {
        System.out.println("Sending email");
    }
}
