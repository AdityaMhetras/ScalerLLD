package com.scaler.lld.inclass.parking.dtos;

import com.scaler.lld.inclass.parking.models.ParkingLot;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CreateLotRequest {

    private Long id;
    private String name;
    private String address;

    private Integer numberOfGates;
    private Integer numberOfFloors;
    private Integer numberOfSpotsPerFloor;

    public ParkingLot toParkingLot() {
        return null;
    }
}
