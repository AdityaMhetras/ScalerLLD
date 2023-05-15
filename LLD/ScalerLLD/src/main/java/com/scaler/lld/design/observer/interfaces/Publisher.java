package com.scaler.lld.design.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

//step 1 create interface of object of interest
public abstract class Publisher {

    List<Observer> observers = new ArrayList<>();
    public void publish() {
        observers.forEach(Observer::consume);
    }
    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void ubsubscribe(Observer observer) {
        observers.remove(observer);
    }
}
