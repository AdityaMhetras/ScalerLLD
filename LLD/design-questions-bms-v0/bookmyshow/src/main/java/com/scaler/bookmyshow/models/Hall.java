package com.scaler.bookmyshow.models;

import com.scaler.bookmyshow.enums.MovieFeature;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Hall extends BaseModel {

    private Integer hallNumber;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();

    @ElementCollection
    @Enumerated
    private List<MovieFeature> features = new ArrayList<>();

    public Hall(Long id, Date createdAt, Date updatedAt, Integer hallNumber) {
        super(id, createdAt, updatedAt);
        this.hallNumber = hallNumber;
    }
}
