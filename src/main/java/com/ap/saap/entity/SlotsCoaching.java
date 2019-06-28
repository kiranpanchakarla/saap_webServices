package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = Constants.TABLE_SLOTS_COACHING)
@Data
public class SlotsCoaching {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "slots_coaching_id")
    private Long id;

    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "slots_coaching_starttime")
    private LocalTime startTime;

    @Column(name = "slots_coaching_endtime")
    private LocalTime endTime;

    @Column(name = "slots_coaching_isactive")
    private boolean active;

    @Column(name = "slots_coaching_isdeleted")
    private boolean deleted;
}
