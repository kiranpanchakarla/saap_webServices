package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_STADIUM)
@Data
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "stadium_id")
    private Long id;

    @Column(name = "stadium_name")
    private String name;

    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "stadium_isactive")
    private boolean active;

    @Column(name = "stadium_isdeleted")
    private boolean deleted;
}
