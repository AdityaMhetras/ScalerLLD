package com.scaler.lld.design.button;
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
        }

        throw new RuntimeException("invalid Platform");
    }
}
