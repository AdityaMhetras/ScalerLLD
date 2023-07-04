package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.TicketStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ticket extends BaseModel {

    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<ShowSeat> seats = new ArrayList<>();

    private Double amount;

    private TicketStatus status;


    public Ticket(Long id, Date createdAt, Date updatedAt, Show show, User user, List<ShowSeat> seats, Double amount, TicketStatus status) {
        super(id, createdAt, updatedAt);
        this.show = show;
        this.user = user;
        this.seats = seats;
        this.amount = amount;
        this.status = status;
    }
}
