package com.ap.saap.service.impl;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ap.saap.entity.Notification;
import com.ap.saap.repository.NotificationRepository;
import com.ap.saap.service.NotificationService;
import com.ap.saap.vo.NotificationsVo;



@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	public NotificationRepository notificationRepository;
	

	
	@Override
	public List<NotificationsVo> findByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		
		List<Notification> notifications =notificationRepository.findByCategoryId(categoryId);
		
		List<NotificationsVo> notificationsVos= new ArrayList<>();
		if(notifications.isEmpty()) {
			return notificationsVos;
		}
		for(Notification notification:notifications) {
			NotificationsVo notificationsVo= new NotificationsVo(notification.getId(), notification.getTitle(), notification.getCreated(), notification.getCategoryId(), notification.getDescription(), notification.getEnabled());
		if(notification.getTitle()!=null) {
			notificationsVo.setTitle(notification.getTitle());
		}else {
			notificationsVo.setTitle("Available Soon..");
		}
		notificationsVos.add(notificationsVo);
		}
		
		return notificationsVos;
	}
	
	@Override
	public List<NotificationsVo> findNotificationDetailsByNotificationId(Integer notificationId) {
		// TODO Auto-generated method stub
		List<Notification> notifications =notificationRepository.findByNotificationId(notificationId);
		
		List<NotificationsVo> notificationsVos= new ArrayList<>();
		if(notifications.isEmpty()) {
			return notificationsVos;
		}
		for(Notification notification:notifications) {
			NotificationsVo notificationsVo= new NotificationsVo(notification.getId(), notification.getTitle(), notification.getCreated(), notification.getCategoryId(), notification.getDescription(), notification.getEnabled());
		if(notification.getTitle()!=null) {
			notificationsVo.setTitle(notification.getTitle());
		}else {
			notificationsVo.setTitle("Available Soon..");
		}
		notificationsVos.add(notificationsVo);
		}
		
		return notificationsVos;
	}

	@Override
	public List<Notification> findByCategory(int CategoryId) {	
		//return notificationRepository.findByCategoryId(CategoryId);
		return notificationRepository.findByCategory(CategoryId);
	}

	@Override
	public String saveNotification(Notification notification) {		
			notificationRepository.save(toEntity(notification));
		return "Success";
	}
	
    private Notification toEntity(Notification notification) {
    	Notification notifi = new Notification();
    	//notifi.setId(notification.getId());
    	notifi.setTitle(notification.getTitle());
    	notifi.setCategoryId(notification.getCategoryId());
    	notifi.setCreated(notification.getCreated());
    	notifi.setEnabled(notification.getEnabled());
    	notifi.setDescription(notification.getDescription());

		return notifi;
    }



	@Override
	public List<Notification> findByNotificationId(long NotificationId) {
		return notificationRepository.findById(NotificationId);
	}

	@Override
	public String updateEmbeded(long NotificationId, int status) {
		Notification notification = notificationRepository.getNotificationById(NotificationId);
		if (notification != null)
		{
			if(status == 1) {
				notification.setEnabled(true);
			}	
			else {
				notification.setEnabled(false);
			}	
			notificationRepository.save(notification);
			return "Success";
		}
		return "failed";
	}
}
