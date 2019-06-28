package com.ap.saap.entity;

import java.util.Date;

import javax.persistence.*;

import com.ap.saap.util.Constants;

import lombok.Data;

@Entity
@Table(name="notification",schema = "stadium")

@Data
public class Notification {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "notification_id")
    private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "created")
	private Date created;
	
	@Column(name = "category_id")
	private int categoryId;
	
	@Column(name = "enabled")
	private boolean isEnabled;
	
	@Column(name = "description")
	private String  description;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
		/* public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}*/
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
		public int getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public boolean getEnabled() {
			return isEnabled;
		}
		public void setEnabled(boolean isEnabled) {
			this.isEnabled = isEnabled;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}


}
