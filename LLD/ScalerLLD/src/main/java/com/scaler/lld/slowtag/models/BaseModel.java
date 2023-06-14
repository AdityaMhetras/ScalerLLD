package com.scaler.lld.slowtag.models;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.sql.Date;

@Data
@SuperBuilder
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
