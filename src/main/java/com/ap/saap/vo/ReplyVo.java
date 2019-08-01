package com.ap.saap.vo;

import java.sql.Date;

public class ReplyVo {

	private Integer id;
	private String name;
	private String body;
	private Date date;
	public ReplyVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReplyVo(Integer id, String name, String body, Date date) {
		super();
		this.id = id;
		this.name = name;
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
		return "ReplyVo [id=" + id + ", name=" + name + ", body=" + body + ", date=" + date + "]";
	}
	
	
	
}
