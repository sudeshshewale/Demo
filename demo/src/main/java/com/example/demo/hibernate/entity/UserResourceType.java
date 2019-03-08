package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="DEMO_USER_RESOURCE_TYPE")
@Inheritance(strategy=InheritanceType.JOINED)
public class UserResourceType {
	
	@Id
	@GeneratedValue
	private int typeId;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_TYPE_ID")
	private AbstractBaseClass resourceType;
	
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="OUTDOOR")
	private String outdoor;
	
	@Column(name="INDOOR")
	private String indoor;
	
	public UserResourceType() {}
	
	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public AbstractBaseClass getResourceType() {
		return resourceType;
	}

	public void setResourceType(AbstractBaseClass resourceType) {
		this.resourceType = resourceType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOutdoor() {
		return outdoor;
	}

	public void setOutdoor(String outdoor) {
		this.outdoor = outdoor;
	}

	public String getIndoor() {
		return indoor;
	}

	public void setIndoor(String indoor) {
		this.indoor = indoor;
	}

	 

}
