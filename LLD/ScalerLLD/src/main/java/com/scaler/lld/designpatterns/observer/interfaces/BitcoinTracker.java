package com.scaler.lld.designpatterns.observer.interfaces;
// step 3 - add concrete publishers

import com.scaler.lld.designpatterns.observer.models.Bitcoin;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BitcoinTracker extends Publisher{

    private Bitcoin bitcoin;

    public void setPrice(Double value) {
        bitcoin = bitcoin.toBuilder()
                .value(value)
                .build();//state change
        publish();//call the publish()
    }



}
