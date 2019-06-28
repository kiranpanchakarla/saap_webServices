package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_USER_NOTIFICATION_CATEGORY)
@Data
public class UserNotificationCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_notification_category_id")
    private Long id;

    @Column(name = "user_notification_category_name")
    private String name;

    @Column(name = "user_notification_category_isactive")
    private boolean active;

    @Column(name = "user_notification_category_isdeleted")
    private boolean deleted;
}
