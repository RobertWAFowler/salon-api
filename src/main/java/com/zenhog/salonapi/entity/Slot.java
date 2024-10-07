package com.zenhog.salonapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "slot")
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "slot_id_gen")
    @SequenceGenerator(name = "slot_id_gen", sequenceName = "slot_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "confirmed_at")
    private Instant confirmedAt;

    @Column(name = "locked_at")
    private Instant lockedAt;

    @Column(name = "slot_for")
    private Instant slotFor;

    @Column(name = "status")
    private Integer status;

    @Column(name = "stylist_name")
    private String stylistName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selected_service_id")
    private com.zenhog.salonapi.entity.SalonServiceDetail selectedService;

}
