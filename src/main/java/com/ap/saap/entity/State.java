package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_STATE)
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "state_id")
    private Long id;

    @Column(name = "state_name")
    private String name;

    @Column(name = "state_isactive")
    private boolean active;

    @Column(name = "state_isdeleted")
    private boolean deleted;
}
