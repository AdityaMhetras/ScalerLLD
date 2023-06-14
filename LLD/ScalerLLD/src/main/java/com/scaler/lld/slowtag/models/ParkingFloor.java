package com.scaler.lld.slowtag.models;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@SuperBuilder
public class ParkingFloor extends BaseModel {

    @Builder.Default
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    private PaymentCounter paymentCounter;
}
