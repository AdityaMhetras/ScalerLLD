package com.scaler.lld.design.kalam;

import com.scaler.lld.design.kalam.models.FountainPen;
import com.scaler.lld.design.kalam.models.Ink;
import com.scaler.lld.design.kalam.models.Nib;
import com.scaler.lld.design.kalam.models.Pen;
import org.junit.Test;

public class TestPen {
    @Test
    public void testInstanceCreation() {
        Ink ink = new Ink();
        Nib nib = new Nib();
        Pen fountainPen = new FountainPen(ink,nib);
    }
}
