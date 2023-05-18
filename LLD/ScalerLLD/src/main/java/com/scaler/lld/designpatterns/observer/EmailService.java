package com.scaler.lld.designpatterns.observer;

import com.scaler.lld.designpatterns.observer.interfaces.Observer;

public class EmailService implements Observer {

    @Override
    public void consume() {
        System.out.println("Sending email");
    }
}
