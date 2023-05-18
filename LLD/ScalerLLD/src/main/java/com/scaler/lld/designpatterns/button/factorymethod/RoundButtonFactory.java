package com.scaler.lld.designpatterns.button.factorymethod;

import com.scaler.lld.designpatterns.button.models.Button;
import com.scaler.lld.designpatterns.button.models.RoundButton;

// step 4 create concrete factory classes
public class RoundButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
