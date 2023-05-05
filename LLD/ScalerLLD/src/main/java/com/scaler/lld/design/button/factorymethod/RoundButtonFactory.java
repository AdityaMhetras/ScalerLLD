package com.scaler.lld.design.button.factorymethod;

import com.scaler.lld.design.button.models.Button;
import com.scaler.lld.design.button.models.RoundButton;

// step 4 create concrete factory classes
public class RoundButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
