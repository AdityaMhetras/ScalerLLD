package com.scaler.lld.design.abstractfactory;

import com.scaler.lld.design.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.design.abstractfactory.models.Button;
import com.scaler.lld.design.abstractfactory.models.Checkbox;
import com.scaler.lld.design.abstractfactory.models.DarkButton;
import com.scaler.lld.design.abstractfactory.models.DarkCheckbox;

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
