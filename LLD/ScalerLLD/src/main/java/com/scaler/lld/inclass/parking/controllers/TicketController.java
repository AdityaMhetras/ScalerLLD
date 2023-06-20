package com.scaler.lld.inclass.parking.controllers;

import com.scaler.lld.inclass.parking.dtos.IssueTicketRequest;
import com.scaler.lld.inclass.parking.interfaces.SpotAllotmentStrategy;
import com.scaler.lld.inclass.parking.models.Ticket;
import com.scaler.lld.inclass.parking.services.TicketService;

public class TicketController {

    private TicketService service;

    public Ticket createTicket(IssueTicketRequest request, SpotAllotmentStrategy strategy) {
        service = new TicketService(strategy);
        return service.createTicket(request);
    }
}
