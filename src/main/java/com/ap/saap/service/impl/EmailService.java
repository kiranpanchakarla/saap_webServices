package com.ap.saap.service.impl;

import java.util.Date;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.ap.saap.entity.Feedback;

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
    	   String emailData="Hi there, <br>"
	    			+"\t"+"&nbsp;&nbsp;<br><b> A feedback has been sent by " +feedback.getName()+ ", Email id : "+feedback.getEmail()+"<br>"
	    			+"\t With subject : " +feedback.getSubject()+ "<br>"
	    			+"\t Feedback Message : "+feedback.getBody()
	    			+"<br>Thank you,"
	    			+"<br>" +feedback.getName();
           public void prepare(MimeMessage mimeMessage) throws MessagingException {
               MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
               message.setFrom("");
               message.setTo("so-it-saap@ap.gov.in");
               message.setSubject(feedback.getSubject());
               message.setText(emailData, true);
               message.setSentDate(new Date());
           }

       };
   }

  
}
