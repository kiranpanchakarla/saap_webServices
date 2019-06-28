package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_CONSTITUENCY)
@Data
public class Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "constituency_id")
    private Long id;

    @Column(name = "constituency_name")
    private String name;

    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "constituency_isactive")
    private boolean active;

    @Column(name = "constituency_isdeleted")
    private boolean deleted;
}
