package com.scaler.lld.design.atm.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Location {
        private String country;
        private String pincode;
        private String state;
        private String city;
        private String zone;
        private String address;
}
