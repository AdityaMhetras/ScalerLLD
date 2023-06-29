package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.PaymentMode;
import com.scaler.bookmyshow.enums.PaymentStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Entity
@NoArgsConstructor
public class Payment extends BaseModel {

    private String referenceId;

    private Double amount;

    @ManyToOne
    private Ticket ticket;

    @Enumerated
    private PaymentMode mode;

    @Enumerated
    private PaymentStatus status;

    public Payment(Long id, Date createdAt, Date updatedAt, String referenceId, Double amount, PaymentMode mode, PaymentStatus status) {
        super(id, createdAt, updatedAt);
        this.referenceId = referenceId;
        this.amount = amount;
        this.mode = mode;
        this.status = status;
    }
}
