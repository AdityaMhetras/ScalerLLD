package com.scaler.lld.inclass.parking.services;

import com.scaler.lld.inclass.parking.models.ParkingLot;
import com.scaler.lld.inclass.parking.models.ParkingSpot;
import com.scaler.lld.inclass.parking.models.VehicleType;
import com.scaler.lld.inclass.parking.repository.ParkingLotRepository;
import com.scaler.lld.inclass.parking.repository.ParkingSpotRepository;

public class ParkingSpotService {

    private ParkingSpotRepository repository;
    public void createParkingSpots(ParkingLot persistentLot) {

    }

    public ParkingSpot allocateSpot(Long parkingLotId, VehicleType vehicleType) {
        // Get the first slot available and of the same type

        return repository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }

    public void update(ParkingSpot spot) {
    }

    public ParkingSpot getSpot(Long spotId) {
        return null;
    }
}
