package com.zenhog.salonapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "salon_service_detail")
public class SalonServiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salon_service_detail_id_gen")
    @SequenceGenerator(name = "salon_service_detail_id_gen", sequenceName = "salon_service_detail_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "time_in_minutes")
    private Integer timeInMinutes;

}
