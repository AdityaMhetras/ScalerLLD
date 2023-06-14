package com.scaler.lld.inclass.parking.services;

import com.scaler.lld.inclass.parking.models.ParkingLot;
import com.scaler.lld.inclass.parking.models.ParkingSpot;
import com.scaler.lld.inclass.parking.repository.ParkingLotRepository;

public class ParkingLotService {

    private ParkingLotRepository repository;
    private ParkingSpotService parkingSpotService;

    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        //create parkingLot
        ParkingLot persistentLot = repository.save(parkingLot);

        parkingSpotService.createParkingSpots(persistentLot);
        // create associated entities - floor, spots, gate
        return persistentLot;
    }

}
