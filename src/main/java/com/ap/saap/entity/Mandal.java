package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_MANDAL)
@Data
public class Mandal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "mandal_id")
    private Long id;

    @Column(name = "mandal_name")
    private String name;

    @Column(name = "constituency_id")
    private Long constituencyId;

    @Column(name = "mandal_isactive")
    private boolean active;

    @Column(name = "mandal_isdeleted")
    private boolean deleted;
}
