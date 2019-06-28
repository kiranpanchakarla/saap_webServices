package com.ap.saap.entity;

import com.ap.saap.util.Constants;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = Constants.TABLE_USER_NOTIFICATION)
@Data
public class UserNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_notification_id")
    private Long id;

    @Column(name = "user_notification_category_id")
    private Long categoryId;

    @Column(name = "user_notification_title")
    private String title;

    @Column(name = "user_notification_desc")
    private String description;

    @Column(name = "user_notification_filepath")
    private String filePath;

    @Column(name = "user_notification_isactive")
    private boolean active;

    @Column(name = "user_notification_isdeleted")
    private boolean deleted;
}
