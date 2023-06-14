package com.scaler.lld.inclass.parking.dtos;

import com.scaler.lld.inclass.parking.models.VehicleType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IssueTicketRequest {

    private Long parkingLotId;
    private String vehicleNumber; // getOrCreate -> Fetch existing or create a new one
    private VehicleType vehicleType;
    private Long entryGateId;
}
