package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_SPORT)
@Data
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "sport_id")
    private Long id;

    @Column(name = "sport_name")
    private String name;

    @Column(name = "sport_isactive")
    private boolean active;

    @Column(name = "sport_isdeleted")
    private boolean deleted;
}
