package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = Constants.TABLE_EVENT_BOOKING)
@Data
public class EventBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_booking_id")
    private Long id;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "event_booking_date")
    private LocalDateTime date;

    @Column(name = "event_booking_start_time")
    private LocalTime startTime;

    @Column(name = "event_booking_end_time")
    private LocalTime endTime;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "event_booking_cost")
    private Double cost;

    @Column(name = "event_booking_status_id")
    private Long statusId;

    @Column(name = "event_booking_isactive")
    private boolean active;

    @Column(name = "event_booking_isdeleted")
    private boolean deleted;
}
