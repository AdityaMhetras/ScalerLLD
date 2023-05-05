package com.scaler.lld.design.button;

import com.scaler.lld.design.button.factorymethod.GenericButtonFactory;
import com.scaler.lld.design.button.factorymethod.LinkButtonFactory;
import com.scaler.lld.design.button.factorymethod.PrimaryButtonFactory;
import com.scaler.lld.design.button.factorymethod.RoundButtonFactory;
import com.scaler.lld.design.button.models.*;
import com.scaler.lld.design.button.simplefactory.ButtonFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GenericButtonFactoryTest {

    private GenericButtonFactory factory;

    @Before
    public void setup() {
        factory = FactoryFactory.createFactory("round");
    }

    @Test
    public void testButton() {
        Button round  = new RoundButton();
    }

    @Test
    public void testButtonFactory() {
        Button round = ButtonFactory.createButton(Platform.iOS);
        Assert.assertTrue("if platform is iOS, button is round", round instanceof RoundButton);
    }



    @Test
    public void testFactoryMethod() {
        Button round = factory.createButton();
        Assert.assertTrue("If primary button is generated from primaryfactory, it should be primary",round instanceof RoundButton);
    }
}
