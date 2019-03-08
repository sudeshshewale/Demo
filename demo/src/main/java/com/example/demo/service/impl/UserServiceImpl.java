package com.example.demo.service.impl;

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
public boolean saveUser(User user) {
	// TODO Auto-generated method stub
	userRepository.save(user);
	
	
	System.out.println("Data not saved");
	return false;
}

@Override
public User findById(Long id) {
	// TODO Auto-generated method stub
	
	return userRepository.findUserByUserId(id);
}


}
