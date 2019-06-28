package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_PLAY_FIELD)
@Data
public class PlayField {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "playfield_id")
    private Long id;

    @Column(name = "playfield_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "sport_id", referencedColumnName = "sport_id")
    private Sport sport;

    @Column(name = "playfield_isactive")
    private boolean active;

    @Column(name = "playfield_isdeleted")
    private boolean deleted;
}
