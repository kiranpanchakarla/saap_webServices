package com.ap.saap.vo;

import java.util.Date;

public class NotificationsVo {

	private long id;
	
	private String title;
	
	private Date created;
	
	private Integer categoryId;
	
	private String description;
	
	private boolean enabled;

	

	public NotificationsVo(long id, String title, Date created, Integer categoryId, String description,
			boolean enabled) {
		super();
		this.id = id;
		this.title = title;
		this.created = created;
		this.categoryId = categoryId;
		this.description = description;
		this.enabled = enabled;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "NotificationsVo [id=" + id + ", title=" + title + ", created=" + created + ", categoryId=" + categoryId
				+ ", description=" + description + ", enabled=" + enabled + "]";
	}
	
	
}
