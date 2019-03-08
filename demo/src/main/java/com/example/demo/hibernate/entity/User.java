package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name="DEMO_USER")
public class User {
	
	@Id 
	@Column(name="USER_ID")
	@GeneratedValue
	private long userId;
	
	@Column(name = "USERNAME")
	private String userName;
	
	public User() {}
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	

}
