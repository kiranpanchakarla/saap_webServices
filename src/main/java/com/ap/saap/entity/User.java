package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_USER)
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_address")
    private String address;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_mobile")
    private String mobile;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_isadmin")
    private boolean admin;

    @Column(name = "user_isactive")
    private boolean active;

    @Column(name = "user_isdeleted")
    private boolean deleted;
}
