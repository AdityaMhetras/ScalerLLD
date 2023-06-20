package com.scaler.lld.inclass.parking.controllers;

import com.scaler.lld.inclass.parking.models.ParkingSpot;
import com.scaler.lld.inclass.parking.models.SpotStatus;
import com.scaler.lld.inclass.parking.models.Ticket;
import com.scaler.lld.inclass.parking.models.TicketStatus;
import com.scaler.lld.inclass.parking.services.CheckClearanceService;
import com.scaler.lld.inclass.parking.services.ParkingSpotService;
import com.scaler.lld.inclass.parking.services.TicketService;

import java.util.TreeMap;

public class ExitLotController {

    private CheckClearanceService clearanceService;
    private ParkingSpotService spotService;

    private TicketService ticketService;

    public void exitLot(Long ticketId) {
        // validate ticketId
        if(validate(ticketId)) {
            Ticket ticket = ticketService.getTicket(ticketId);
            ParkingSpot spot = spotService.getSpot(ticket.getParkingSpotId());
            spot.setSpotStatus(SpotStatus.AVAILABLE);
            spotService.update(spot);
        }

    }

    public boolean validate(Long ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        if (ticket == null || ticket.getStatus()== TicketStatus.PENDING) {
            return false;
        }
        return true;
    }
}
