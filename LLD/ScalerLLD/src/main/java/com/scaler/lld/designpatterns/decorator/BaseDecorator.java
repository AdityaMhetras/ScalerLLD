package com.scaler.lld.designpatterns.decorator;

import com.scaler.lld.designpatterns.decorator.interfaces.Database;
import lombok.AllArgsConstructor;

//step 3 create base decorator implementing product interface
@AllArgsConstructor
public class BaseDecorator implements Database {

    //composition
    private Database database;
    public String read() {
        return database.read();
    }

    public void write(String value) {
        database.write(value);
    }
}
