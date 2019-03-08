package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Demo_USER_RESOURCE_PEOPLE")
public class UserResourcePeople {
	
	public UserResourcePeople() {}
	
	@Id
	@GeneratedValue
	private int userResourceId;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_TYPE_ID")
	private AbstractBaseClass resourceType;
	
	
	public int getUserResourceId() {
		return userResourceId;
	}
	public void setUserResourceId(int userResourceId) {
		this.userResourceId = userResourceId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public AbstractBaseClass getResourceType() {
		return resourceType;
	}
	public void setResourceType(AbstractBaseClass resourceType) {
		this.resourceType = resourceType;
	}
	
	
	

}
