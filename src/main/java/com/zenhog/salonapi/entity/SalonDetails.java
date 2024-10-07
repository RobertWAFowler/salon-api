package com.zenhog.salonapi.entity;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
@ToString
public class SalonDetails {

    @Value("${salon.name}")
    private String name;

    @Value("${salon.address}")
    private String address;

    @Value("${salon.city}")
    private String city;

    @Value("${salon.state}")
    private String state;

    @Value("${salon.zipcode}")
    private String zipcode;

    @Value("${salon.phone}")
    private String phone;
}

