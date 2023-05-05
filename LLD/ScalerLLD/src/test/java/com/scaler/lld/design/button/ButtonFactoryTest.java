package com.scaler.lld.design.button;

import org.junit.Assert;
import org.junit.Test;

public class ButtonFactoryTest {

    @Test
    public void testButton() {
        Button round  = new RoundButton();
    }

    @Test
    public void testButtonFactory() {
        Button round = ButtonFactory.createButton(Platform.iOS);
        Assert.assertTrue("if platform is iOS, button is round", round instanceof RoundButton);
    }
}
