package com.ap.saap.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="replies",schema="stadium")
public class FeedbackReply {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="reply_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="body")
	private String body;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "feedback_id", nullable = false)
	private Feedback feedback;

	public FeedbackReply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackReply(Integer id, String name, String body, Date date, Feedback feedback) {
		super();
		this.id = id;
		this.name = name;
		this.body = body;
		this.date = date;
		this.feedback = feedback;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "FeedbackReply [id=" + id + ", name=" + name + ", body=" + body + ", date=" + date + "]";
	}
	
	
}
