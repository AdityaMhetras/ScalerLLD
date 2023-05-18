package com.scaler.lld.designpatterns.abstractfactory;

import com.scaler.lld.designpatterns.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.designpatterns.abstractfactory.models.Button;
import com.scaler.lld.designpatterns.abstractfactory.models.Checkbox;
import com.scaler.lld.designpatterns.abstractfactory.models.LightButton;
import com.scaler.lld.designpatterns.abstractfactory.models.LightCheckbox;

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
