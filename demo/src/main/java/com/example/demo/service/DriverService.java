package com.example.demo.service;

import java.util.Optional;

import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.User;

public interface DriverService {
	
	public boolean saveDriver(Driver driver);
	
	public Driver findById(int id);

}
