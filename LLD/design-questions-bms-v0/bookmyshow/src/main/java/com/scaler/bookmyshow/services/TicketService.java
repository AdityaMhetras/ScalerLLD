package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.dtos.CreateTicketDto;
import com.scaler.bookmyshow.enums.SeatStatus;
import com.scaler.bookmyshow.enums.TicketStatus;
import com.scaler.bookmyshow.exceptions.SeatUnavailableException;
import com.scaler.bookmyshow.models.ShowSeat;
import com.scaler.bookmyshow.models.Ticket;
import com.scaler.bookmyshow.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {

    private TicketRepository ticketRepository;
    private ShowSeatService showSeatService;
    private UserService userService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket createTicket(CreateTicketDto request) {
        // get seats requested
        List<ShowSeat> showSeats = showSeatService.getSeats(request.getShowSeatIds());
        //check for seat availability
        checkAvailability(showSeats);

        // mark the seats as blocked
        showSeatService.blockSeats(showSeats);

        // create and persist the ticket
        Ticket ticket = new Ticket();
        ticket.setStatus(TicketStatus.PENDING);
        ticket.setUser(userService.getUser(request.getUserId()));
        ticket.setSeats(showSeats);

        return ticketRepository.save(ticket);
    }

    private void checkAvailability(List<ShowSeat> showSeats) {
        for(ShowSeat seat : showSeats) {
            if (seat.getStatus() != SeatStatus.AVAILABLE) {
                throw new SeatUnavailableException(seat.getId());
            }
        }
    }
}
