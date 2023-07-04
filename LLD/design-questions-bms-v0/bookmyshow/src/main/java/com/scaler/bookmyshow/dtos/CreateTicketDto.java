package com.scaler.bookmyshow.dtos;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CreateTicketDto {
    // user id
    private Long userId;

    private Long showId;

    private List<Long> showSeatIds = new ArrayList<>();
}
