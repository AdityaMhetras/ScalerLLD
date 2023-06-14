package com.scaler.lld.slowtag.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
public class Ticket extends BaseModel {

    private Long vehicleId;
    private Vehicle vehicle;

    private Long parkingSpotId;
    private ParkingSpot parkingSpot;

    private LocalDateTime entryTime;
    private TicketStatus status;

    private Long issuerId;
    private ParkingAttendant issuedBy;

    private Long entryGateId;
    private Gate entryGate;
}
