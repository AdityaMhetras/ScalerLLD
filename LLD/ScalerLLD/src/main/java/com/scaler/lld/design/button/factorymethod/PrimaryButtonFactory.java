package com.scaler.lld.design.button.factorymethod;

import com.scaler.lld.design.button.models.Button;
import com.scaler.lld.design.button.models.PrimaryButton;

// step 4 create concrete factory classes

public class PrimaryButtonFactory implements GenericButtonFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }
}
