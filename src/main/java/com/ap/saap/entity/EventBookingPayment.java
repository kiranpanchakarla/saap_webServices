package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = Constants.TABLE_EVENT_BOOKING_PAYMENT)
@Data
public class EventBookingPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_booking_payment_id")
    private Long id;

    @Column(name = "event_booking_id")
    private Long eventBookingId;

    @Column(name = "pg_transaction_id")
    private Long transactionId;

    @Column(name = "pg_transaction_status")
    private String status;
}
