package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_EVENT)
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_id")
    private Long id;

   

	@ManyToOne
    @JoinColumn(name = "stadium_id", referencedColumnName = "stadium_id")
    private Stadium stadium;

    @ManyToOne
    @JoinColumn(name = "playfield_id", referencedColumnName = "playfield_id")
    private PlayField playField;

    @ManyToOne
    @JoinColumn(name = "sport_type_id", referencedColumnName = "sport_type_id")
    private SportType sportType;

    @Column(name = "event_costperday")
    private Double costPerDay;

    @Column(name = "event_costperhour")
    private Double costPerHour;

    @Column(name = "event_isactive")
    private boolean active;

    @Column(name = "event_isdeleted")
    private boolean deleted;

	
}
