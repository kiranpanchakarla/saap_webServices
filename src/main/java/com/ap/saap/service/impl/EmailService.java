package com.ap.saap.service.impl;

import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.ap.saap.model.Feedback;
@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	
	 public void sendEmail(Feedback feedback) {
			// TODO Auto-generated method stub
			   mailSender.send(createMailMessage(feedback));
	}
	
   
   protected MimeMessagePreparator createMailMessage(Feedback feedback) {
       return new MimeMessagePreparator() {
           public void prepare(MimeMessage mimeMessage) throws MessagingException {
               MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
               message.setFrom(feedback.getFromEmail());
               message.setTo(feedback.getTo_address());
               message.setSubject(feedback.getSubject());
               message.setText(feedback.getBody(), true);
               message.setSentDate(new Date());
           }

       };
   }

  
}
