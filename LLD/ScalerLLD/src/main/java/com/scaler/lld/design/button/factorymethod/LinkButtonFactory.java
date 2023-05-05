package com.scaler.lld.design.button.factorymethod;

import com.scaler.lld.design.button.models.Button;
import com.scaler.lld.design.button.models.LinkButton;

public class LinkButtonFactory implements GenericButtonFactory{
    @Override
    public Button createButton() {
        return new LinkButton();
    }
}
