package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.UserResourcePeople;
import com.example.demo.repository.UserResourcePeopleRepository;
import com.example.demo.service.UserResourcePeopleService;

@Service
public class UserResourcePeopleServiceImpl implements UserResourcePeopleService{
	
	@Autowired
	UserResourcePeopleRepository userResourcePeopleRepository;

	@Override
	public UserResourcePeople saveUserPeople(UserResourcePeople userPeople) {
		// TODO Auto-generated method stub
		userResourcePeopleRepository.save(userPeople);
		
		System.out.println("Data not saved");
		return userPeople;
		
	}
}
