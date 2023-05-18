package com.scaler.lld.designpatterns.abstractfactory;

import com.scaler.lld.designpatterns.abstractfactory.interfaces.FormFactory;
import com.scaler.lld.designpatterns.abstractfactory.models.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractFormFactoryTest {

    private FormFactory factory;

    @Before
    public void setup() {
        factory = new LightFormFactory();
    }

    @Test
    public void testFormFactory() {
        Button darkBtn = factory.createButton();
        Checkbox darkChkbox = factory.createCheckbox();

        Assert.assertTrue("if button factory is called btn shud be lightbtn",darkBtn instanceof LightButton);
        Assert.assertTrue("if checkbox factory is called btn shud be lightchkbox",darkChkbox instanceof LightCheckbox);

    }
}
