package com.scaler.lld.design.abstractfactory;

import com.scaler.lld.design.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.design.abstractfactory.models.Button;
import com.scaler.lld.design.abstractfactory.models.Checkbox;
import com.scaler.lld.design.abstractfactory.models.LightButton;
import com.scaler.lld.design.abstractfactory.models.LightCheckbox;

//step 4 create concrete factories
public class LightFormFactory implements FormFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
