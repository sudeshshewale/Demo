package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.User;


public interface UserService {
	
	public boolean saveUser(User user);
	
	public User findById(Long id);

}
