package com.scaler.lld.design.button.simplefactory;

import com.scaler.lld.design.button.models.Button;
import com.scaler.lld.design.button.models.Platform;
import com.scaler.lld.design.button.models.PrimaryButton;
import com.scaler.lld.design.button.models.RoundButton;

//step 3 create factory class
public class ButtonFactory {
    //create a STATIC factory method
    //requirements
    //- accept a parameter
    //- return the product interface

    public static Button createButton(Platform platform) {
        switch (platform) {
            case ANDROID : return new RoundButton();
            case MAC_OS : return new PrimaryButton();
            case iOS : return new RoundButton();
            case WINDOWS: return new PrimaryButton();

        }

        throw new RuntimeException("invalid Platform");
    }
}
