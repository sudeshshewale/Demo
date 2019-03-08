package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEMO_DRIVER")
public class Driver extends AbstractBaseClass  {
	
	public Driver() {}
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;*/
	
	@Column
	private String driverName;

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
	
	
	

}
