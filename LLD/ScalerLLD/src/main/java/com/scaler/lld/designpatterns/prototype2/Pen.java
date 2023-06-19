package com.scaler.lld.designpatterns.prototype2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Pen implements ObjCloneable{

    private String name;

    private String type;

    @Override
    public Pen clone() {
        return new Pen(name, type);
    }
}
