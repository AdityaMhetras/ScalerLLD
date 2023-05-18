package com.scaler.lld.designpatterns.abstractfactory;

import com.scaler.lld.designpatterns.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.designpatterns.abstractfactory.models.Button;
import com.scaler.lld.designpatterns.abstractfactory.models.Checkbox;
import com.scaler.lld.designpatterns.abstractfactory.models.DarkButton;
import com.scaler.lld.designpatterns.abstractfactory.models.DarkCheckbox;

//step 4 create concrete factories
public class DarkFormFactory implements FormFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
