package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.AbstractBaseClass;
import com.example.demo.repository.BaseClassRepository;
import com.example.demo.service.BaseClassService;

@Service
public class BaseClassServiceImpl implements BaseClassService {
	
	@Autowired
	BaseClassRepository baseClassRepository;

	/*@Override
	public List<AbstractBaseClass> getResourceList(int id) {
		
		return	baseClassRepository.getResourceList(id);
		// TODO Auto-generated method stub
		
	}*/


	
}
