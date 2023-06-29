package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.SeatStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class ShowSeat extends BaseModel {

    private Double price;

    @Enumerated
    private SeatStatus status;

    @ManyToOne
    private Seat seat;

//    @ManyToOne
//    private Show show;

    public ShowSeat(Long id, Date createdAt, Date updatedAt, Double price, SeatStatus status, Seat seat, Show show) {
        super(id, createdAt, updatedAt);
        this.price = price;
        this.status = status;
        this.seat = seat;
    }
}
