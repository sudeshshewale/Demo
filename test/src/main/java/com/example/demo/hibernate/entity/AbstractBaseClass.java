package com.example.demo.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class AbstractBaseClass {
	
	public AbstractBaseClass(){
	super();
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	@SequenceGenerator(name="SEQUENCE2", sequenceName="SEQUENCE2", allocationSize=1)
	@Column(name="RESOURCE_TYPE_ID")
	private int id;

	@Column(name="RESOURCE_TABLE_ID")
	private int resourceTableId;
	
	@Column(name="RESOURCE_TABLE_NAME")
	private String resourceTablename;
	
	
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="user_roles",
    joinColumns={@JoinColumn(name="resource_id", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="user_id", referencedColumnName="id")})
    private User user;*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	/*public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	*/

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
