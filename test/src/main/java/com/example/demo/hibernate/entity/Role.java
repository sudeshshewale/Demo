package com.example.demo.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


public class Role {/*
 
    @Id
    @GeneratedValue
    private Integer id;
     
    private String role;
     
    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="user_roles",
    joinColumns=@JoinColumn(name="role_id", referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="user_id", referencedColumnName="id"))
    private User user;
    
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_BASE_CLASS", joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "id"),
				inverseJoinColumns = @JoinColumn(name = "RESOURCE_ID", referencedColumnName = "id"))
	private AbstractBaseClass resource ; 
	
     
    public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
     
*/}