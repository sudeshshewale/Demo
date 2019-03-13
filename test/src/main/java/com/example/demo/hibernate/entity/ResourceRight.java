package com.example.demo.hibernate.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author A747654
 * The Class ResourceRight
 * 
 */

@Entity
@Table(name="TBL_RESOURCE_RIGHT")
@Inheritance(strategy=InheritanceType.JOINED)
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public  class ResourceRight {
	
	@Id
	@Column(name = "ID",updatable = false, nullable = false,unique=true)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	

	@Column(name="OUTDOOR")
	private String outdoor;
	
	@Column(name="INDOOR")
	private String indoor;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the outdoor
	 */
	public String getOutdoor() {
		return outdoor;
	}

	/**
	 * @param outdoor the outdoor to set
	 */
	public void setOutdoor(String outdoor) {
		this.outdoor = outdoor;
	}

	/**
	 * @return the indoor
	 */
	public String getIndoor() {
		return indoor;
	}

	/**
	 * @param indoor the indoor to set
	 */
	public void setIndoor(String indoor) {
		this.indoor = indoor;
	}

}
