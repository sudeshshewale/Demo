package com.example.demo.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table (name="DEMO_USER")
public class User {
	
	@Id 
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
	private long id;
	
	@Column(name = "USERNAME")
	private String userName;
	
	
	/*@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    private AbstractBaseClass resource;
	*/
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinTable(name = "USER_BASE_CLASS", joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
				inverseJoinColumns = @JoinColumn(name = "RESOURCE_ID", referencedColumnName = "RESOURCE_TYPE_ID"))
	private AbstractBaseClass resource ; 
	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JoinTable(name = "USER_RESOURCE_RIGHTS", joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID"),
				inverseJoinColumns = @JoinColumn(name = "RIGHTS_ID", referencedColumnName = "ID"))
	private List<ResourceRight> resourceRights;
	
	
	
	/**
	 * @return the resourceRights
	 */
	public List<ResourceRight> getResourceRights() {
		return resourceRights;
	}



	/**
	 * @param resourceRights the resourceRights to set
	 */
	public void setResourceRights(List<ResourceRight> resourceRights) {
		this.resourceRights = resourceRights;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public AbstractBaseClass getResource() {
		return resource;
	}



	public void setResource(AbstractBaseClass resource) {
		this.resource = resource;
	}

	
	public User() {}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
/*
	@OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="user_roles",
    joinColumns={@JoinColumn(name="user_id", referencedColumnName="USER_ID")},
    inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="id")})
    private Role role;


	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}
	*/

}
