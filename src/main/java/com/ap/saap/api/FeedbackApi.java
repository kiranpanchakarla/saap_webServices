package com.ap.saap.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ap.saap.entity.Notification;
import com.ap.saap.model.Feedback;
import com.ap.saap.service.impl.EmailService;

@RestController
@RequestMapping(value ="/api/general/feedback", produces = MediaType.APPLICATION_JSON_VALUE)
public class FeedbackApi {
	
	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/sendFeedback",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendEmail(@RequestBody Feedback feedback) throws Exception {
		emailService.sendEmail(feedback);
		return "Email is sent successfully";
	}
}
