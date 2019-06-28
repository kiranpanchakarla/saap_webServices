package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = Constants.TABLE_EVENT_BOOKING_HISTORY)
@Data
public class EventBookingHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_booking_history_id")
    private Long id;

    @Column(name = "event_booking_id")
    private Long eventBookingId;

    @Column(name = "event_booking_status_id")
    private Long eventBookingStatusId;

    @Column(name = "event_booking_status_notes")
    private String notes;

    @Column(name = "event_booking_history_datetime")
    private LocalDateTime dateTime;

    @Column(name = "event_booking_history_isactive")
    private boolean active;

    @Column(name = "event_booking_history_isdeleted")
    private boolean deleted;
}
