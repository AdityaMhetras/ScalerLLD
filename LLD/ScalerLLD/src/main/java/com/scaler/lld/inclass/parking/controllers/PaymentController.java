package com.scaler.lld.inclass.parking.controllers;

import com.scaler.lld.inclass.parking.services.PaymentService;

public class PaymentController {

    private PaymentService paymentService;
    // calculate amount to be paid
    public Double getAmount(Long ticketId) {
        return paymentService.getAmount(ticketId);
    }

    public boolean payAmount(Long ticketId, Double amount) {
        if (amount < getAmount(ticketId)) {
            return false;
        }
        return paymentService.payAmount(ticketId, amount);
    }
}
