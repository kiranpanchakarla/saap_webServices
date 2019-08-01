package com.ap.saap.vo;

import java.sql.Date;

public class FeedbackVo {

	private Integer id;
	private String name;
	private String email;
	private String subject;
	private String body;
	private Date date;
	
	public FeedbackVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackVo(Integer id, String name, String email, String subject, String body, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.body = body;
		this.date = date;
	}



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

	@Override
	public String toString() {
		return "FeedbackVo [id=" + id + ", name=" + name + ", email=" + email + ", subject=" + subject + ", body="
				+ body + ", date=" + date + "]";
	}

}
