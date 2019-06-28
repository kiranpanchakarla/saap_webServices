package com.ap.saap.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ap.saap.entity.Notification;
import com.ap.saap.vo.NotificationsVo;



@Service
public interface NotificationService {
	public List<NotificationsVo> findByCategoryId(Integer CategoryId);
	
	public List<NotificationsVo> findNotificationDetailsByNotificationId(Integer notificationId);
	
	public List<Notification> findByCategory(int CategoryId);
	
	public List<Notification> findByNotificationId(long NotificationId);

	public String saveNotification(Notification notification);
	
	
	public String updateEmbeded(long NotificationId,int status);

}
