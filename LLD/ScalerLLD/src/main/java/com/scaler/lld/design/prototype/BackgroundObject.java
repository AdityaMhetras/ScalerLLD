package com.scaler.lld.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//step 2 create concrete objects
@AllArgsConstructor
@Setter
@Getter
public class BackgroundObject implements GraphicalObject{
    private int x;
    private int y;
    private int width;
    private int height;

    private BackgroundObjectType type;

    //step 2.5 implemented the clone method for deep cloning
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x,y,width,height,type);
    }
}
