package com.scaler.lld.inclass.parking.controllers;

import com.scaler.lld.inclass.parking.dtos.CreateLotRequest;
import com.scaler.lld.inclass.parking.models.ParkingLot;
import com.scaler.lld.inclass.parking.services.ParkingLotService;

public class ParkingLotController {

    private ParkingLotService service;

    // create parking lot
    public ParkingLot createParkingLot(CreateLotRequest request) {
        validate(request);
        return service.createParkingLot(request.toParkingLot());
    }

    private void validate(CreateLotRequest request) {
        if (request.getNumberOfFloors() == null) {
            throw new RuntimeException("No number of floors");
        }
    }
}

// Request Object, as flat as possible
// DTO / Request/Response Objects
// DTO


