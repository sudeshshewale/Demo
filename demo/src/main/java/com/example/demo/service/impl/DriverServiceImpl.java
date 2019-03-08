package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.User;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

@Autowired
DriverRepository driverRepository;

@Override
public boolean saveDriver(Driver driver) {
	// TODO Auto-generated method stub
	
	driverRepository.save(driver);
	
	System.out.println("Data not saved");
	
	return false;
}

@Override
public Driver findById(int id) {
	// TODO Auto-generated method stub
	
	return driverRepository.findDriverByDriverId(id);
	
}


}
