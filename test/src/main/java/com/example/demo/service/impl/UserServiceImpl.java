package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUserDetail(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	
	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		
		return userRepository.findById(id);
		
		//return userRepository.findById(id);
	}
	


}
