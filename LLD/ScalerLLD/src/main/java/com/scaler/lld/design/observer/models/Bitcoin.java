package com.scaler.lld.design.observer.models;


import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class Bitcoin {
    private Double value;
}


/*
*
* abc.builder()
*   .setX(x)
*   .build();
* */