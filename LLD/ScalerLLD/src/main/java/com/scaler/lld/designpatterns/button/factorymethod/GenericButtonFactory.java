package com.scaler.lld.designpatterns.button.factorymethod;

import com.scaler.lld.designpatterns.button.models.Button;

//step 3 create factory interface
public interface GenericButtonFactory {
    public Button createButton();

}
