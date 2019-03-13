package com.example.demo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEMO_OPERATOR")
public class Operator extends AbstractBaseClass {
	
	public Operator() {}
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int operatorId;*/
	
	@Column
	private String operatorName;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}
