package com.scaler.lld.designpatterns.button.factorymethod;

import com.scaler.lld.designpatterns.button.models.Button;
import com.scaler.lld.designpatterns.button.models.LinkButton;

public class LinkButtonFactory implements GenericButtonFactory{
    @Override
    public Button createButton() {
        return new LinkButton();
    }
}
