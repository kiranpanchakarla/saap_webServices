package com.ap.saap.api;

import java.util.Date;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.saap.entity.Notification;
import com.ap.saap.service.NotificationService;
import com.ap.saap.util.SaapResponse;
import com.ap.saap.vo.NotificationsVo;

@RestController
@RequestMapping(value ="/api/general/notification", produces = MediaType.APPLICATION_JSON_VALUE)
public class NotificationApi {
	
	@Autowired
	public NotificationService notificationService;
	
	//get title from notification table by CategoryId
	@GetMapping("/categoryyy/{CategoryId}")
	public ResponseEntity<List<Notification>> findByCategory(@PathVariable("CategoryId") int CategoryId ){		
		return new ResponseEntity<>(notificationService.findByCategory(CategoryId),HttpStatus.OK);	
	}
	
	@RequestMapping("/category/{categoryId}")
	public Object getNotificationsByCategoryId(@PathVariable("categoryId") Integer categoryId) {
		List<NotificationsVo> notificationsVo = notificationService.findByCategoryId(categoryId);
		if (notificationsVo.isEmpty()) {
			return new SaapResponse("Invalid categoryId");
		}

		return notificationsVo;
		
	}
	
	@GetMapping("/Listtt/{NotificationId}")
	public ResponseEntity<List<Notification>> findByNotificationId(@PathVariable("NotificationId") long NotificationId ){		
		return new ResponseEntity<>(notificationService.findByNotificationId(NotificationId),HttpStatus.OK);	
	}
	@RequestMapping("/list/{notificationId}")
	public Object getNotificationDetailsByNotificationId(@PathVariable("notificationId") Integer notificationId) {
		List<NotificationsVo> notificationsVo = notificationService.findNotificationDetailsByNotificationId(notificationId);
		if (notificationsVo.isEmpty()) {
			return new SaapResponse("Invalid notificationId");
		}

		return notificationsVo;
	}	
	
/*//	@RequestMapping("/districts/districtofficer/{districtid}")
//	public Object getDistrictOfficer(@PathVariable("districtid") Integer districtId) {
//
//		List<DistrictOfficerVo> districtOfficerVos = districtOfficerService.getDistrictOfficers(districtId);
//		if (districtOfficerVos.isEmpty()) {
//			return new SaapResponse("Invalid districtId");
//		}
//
//		return districtOfficerVos;
//
//	}
*/	
	@PostMapping("/Enabled/{NotificationId}/{status}")
	public String updateEmbeded(@PathVariable("NotificationId") long NotificationId,@PathVariable int status ){		
		return notificationService.updateEmbeded(NotificationId,status);
	}
	
	@RequestMapping(value = "/addNotification",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object insertNotification(@RequestBody Notification notification) {
		return notificationService.saveNotification(notification);
	}	
}
