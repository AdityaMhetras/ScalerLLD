package com.scaler.lld.slowtag.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@SuperBuilder
public class Invoice extends BaseModel {

    private Date exitTime;
    private double amount;

    private Long ticketId;
    private Ticket ticket;

    private Long paymentId;
    private Payment payment;
}
