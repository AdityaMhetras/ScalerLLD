package com.scaler.bookmyshow.controller;

import com.scaler.bookmyshow.dtos.CreateTicketDto;
import com.scaler.bookmyshow.dtos.CreateUserDto;
import com.scaler.bookmyshow.models.Ticket;
import com.scaler.bookmyshow.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/ticket")
public class TickerController {

    private TicketService ticketService;

    // create a ticket
    // verb - endpoint
    @PostMapping("/")
    public Ticket createTicket(@RequestBody CreateTicketDto request) {
        return ticketService.createTicket(request);
    }
}
