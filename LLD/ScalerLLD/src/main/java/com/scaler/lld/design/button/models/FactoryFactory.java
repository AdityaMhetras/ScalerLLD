package com.scaler.lld.design.button.models;

import com.scaler.lld.design.button.factorymethod.GenericButtonFactory;
import com.scaler.lld.design.button.factorymethod.PrimaryButtonFactory;
import com.scaler.lld.design.button.factorymethod.RoundButtonFactory;

public class FactoryFactory {
    public static GenericButtonFactory createFactory(String type){
        switch (type){
            case "round" : return new RoundButtonFactory();
            case "primary" : return new PrimaryButtonFactory();
        }
        throw new RuntimeException("Invalid type");
    }
}
