package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_VILLAGE)
@Data
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "village_id")
    private Long id;

    @Column(name = "village_name")
    private String name;

    @Column(name = "mandal_id")
    private Long mandalId;

    @Column(name = "village_isactive")
    private boolean active;

    @Column(name = "village_isdeleted")
    private boolean deleted;
}
