package com.scaler.lld.inclass.parking.services;

import com.scaler.lld.inclass.parking.models.Ticket;
import com.scaler.lld.inclass.parking.models.TicketStatus;

public class PaymentService {

    private TicketService ticketService;

    public Double getAmount(Long ticketId) {
        Ticket ticket = ticketService.getTicket(ticketId);
        if (ticket == null) {
            throw new RuntimeException("ticket not found");
        }
        return calculateAmount(ticket);
    }

    private Double calculateAmount(Ticket ticket) {
        return 0D;
    }


    public boolean payAmount(Long ticketId, Double amount) {
        Ticket ticket = ticketService.getTicket(ticketId);
        ticket.setStatus(TicketStatus.DONE);
        ticketService.save(ticketId);
        return true;
    }
}
