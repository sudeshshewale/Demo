package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.User;


public interface UserService {
	
	public User saveUserDetail(User user);
	
	public Optional<User> findById(Long id);
}
