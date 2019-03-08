package com.example.demo.service;

import java.util.List;

import com.example.demo.hibernate.entity.AbstractBaseClass;

public interface BaseClassService {
	
	public List<AbstractBaseClass> getResourceList(int id);

}
