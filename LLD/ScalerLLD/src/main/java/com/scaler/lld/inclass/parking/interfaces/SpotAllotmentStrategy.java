package com.scaler.lld.inclass.parking.interfaces;

import com.scaler.lld.inclass.parking.models.ParkingSpot;
import com.scaler.lld.inclass.parking.models.VehicleType;

public abstract class SpotAllotmentStrategy {
    public abstract ParkingSpot allocateSpot(Long parkingLotId, VehicleType vehicleType);

    public void update(ParkingSpot spot) {

    }
}
