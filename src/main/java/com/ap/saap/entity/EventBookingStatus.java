package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_EVENT_BOOKING_STATUS)
@Data
public class EventBookingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_booking_status_id")
    private Long id;

    @Column(name = "event_booking_status_name")
    private String name;

    @Column(name = "event_booking_status_isactive")
    private boolean active;

    @Column(name = "event_booking_status_isdeleted")
    private boolean deleted;
}
