package com.scaler.lld.design.button.factorymethod;

import com.scaler.lld.design.button.models.Button;

//step 3 create factory interface
public interface GenericButtonFactory {
    public Button createButton();

}
