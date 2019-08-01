package com.ap.saap.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="feedback",schema="stadium")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="feedback_id")
	private Integer id;
	
	@Column(name="feedback_name")
	private String name;
	
	@Column(name="email")
    private String email;
    //@Value("${send.email}")
	//private String to_address;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="body")
	private String body;
	
	@Column(name="date")
	private Date date;
	
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Feedback(Integer id, String name, String email, String subject, String body, Date date,
			Set<FeedbackReply> feedbackReply) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.body = body;
		this.date = date;
		this.feedbackReply = feedbackReply;
	} 
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="feedback",cascade = CascadeType.ALL)
    private Set<FeedbackReply> feedbackReply;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Set<FeedbackReply> getFeedbackReply() {
		return feedbackReply;
	}


	public void setFeedbackReply(Set<FeedbackReply> feedbackReply) {
		this.feedbackReply = feedbackReply;
	}

	
	
	
	  
}
