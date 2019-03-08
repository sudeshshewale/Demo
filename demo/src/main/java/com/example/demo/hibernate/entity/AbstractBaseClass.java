package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class AbstractBaseClass {
	
//	public AbstractBaseClass(){
//	super();
//}

	
	@Id
	@GeneratedValue
	@Column(name="RESOURCE_TYPE_ID")
	private int resourceTypeId;
	
	@Column(name="RESOURCE_TABLE_ID")
	private int resourceTableId;
	
	@Column(name="RESOURCE_TABLE_NAME")
	private String resourceTablename;
	
	public int getResourceTypeId() {
		return resourceTypeId;
	}

	public void setResourceTypeId(int resourceTypeId) {
		this.resourceTypeId = resourceTypeId;
	}

	public int getResourceTableId() {
		return resourceTableId;
	}

	public void setResourceTableId(int resourceTableId) {
		this.resourceTableId = resourceTableId;
	}
	
	public String getResourceTablename() {
		return resourceTablename;
	}

	public void setResourceTablename(String resourceTablename) {
		this.resourceTablename = resourceTablename;
	}



	
	

}
