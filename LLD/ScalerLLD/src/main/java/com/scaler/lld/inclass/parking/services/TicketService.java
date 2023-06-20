package com.scaler.lld.inclass.parking.services;

import com.scaler.lld.inclass.parking.dtos.IssueTicketRequest;
import com.scaler.lld.inclass.parking.interfaces.SpotAllotmentStrategy;
import com.scaler.lld.inclass.parking.models.ParkingSpot;
import com.scaler.lld.inclass.parking.models.SpotStatus;
import com.scaler.lld.inclass.parking.models.Ticket;
import com.scaler.lld.inclass.parking.repository.TicketRepository;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
public class TicketService {

    private SpotAllotmentStrategy strategy;
    private VehicleService vehicleService;
    private TicketRepository ticketRepository;

    public TicketService(SpotAllotmentStrategy strategy) {
        this.strategy = strategy;
    }

    public Ticket save(Long ticketId) {

        return ticketRepository.save(getTicket(ticketId));
    }

    public Ticket createTicket(IssueTicketRequest request) {

        // check if parking lot is full
        ParkingSpot spot = strategy.allocateSpot(request.getParkingLotId(), request.getVehicleType());
        if (spot == null) {
            throw new RuntimeException("Spot not available");
        }

        // update spot status
        spot.setSpotStatus(SpotStatus.FILLED);

        // persist the spot
        strategy.update(spot);

        // create the ticket
        Ticket ticket = Ticket.builder()
                .entryTime(LocalDateTime.now())
                .parkingSpotId(spot.getId())
                .entryGateId(request.getEntryGateId())
                .vehicle(vehicleService.findOrCreate(request.getVehicleNumber(),request.getVehicleType()))
                .build();

        return  ticketRepository.save(ticket);
    }

    public Ticket getTicket(Long ticketId) {
        return ticketRepository.get(ticketId);
    }
}
