package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_DISTRICT)
@Data
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "district_id")
    private Long id;

    @Column(name = "district_name")
    private String name;

    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "district_isactive")
    private boolean active;

    @Column(name = "district_isdeleted")
    private boolean deleted;
}
