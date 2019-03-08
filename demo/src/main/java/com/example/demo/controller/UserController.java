package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.hibernate.entity.AbstractBaseClass;
import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.Operator;
import com.example.demo.hibernate.entity.User;
import com.example.demo.hibernate.entity.UserResourcePeople;
import com.example.demo.service.BaseClassService;
import com.example.demo.service.DriverService;
import com.example.demo.service.OperatorService;
import com.example.demo.service.UserResourcePeopleService;
import com.example.demo.service.UserResourceTypeService;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	DriverService driverService;
	
	@Autowired
	OperatorService operatorService;
	
	
	@Autowired
	UserResourcePeopleService userResourcePeopleService;
	
	@Autowired
	BaseClassService baseClassService;
	
	
	
	@CrossOrigin
	@RequestMapping(value = "/saveuser")
	  public void createEntity() {
		
		/*
		User user = new User();
		
		user.setUserName("Tango");
		userService.saveUser(user); 
		System.out.println("User Saved Successfully!");*/
		
		
		Driver driver=new Driver();
		
		driver.setDriverName("Driver2");
		driver.setResourceTableId(8);
		driver.setResourceTablename("Driver");
		driverService.saveDriver(driver);
		System.out.println("driver Saved Successfully!");
		
		
		/*
		Operator operator=new Operator();
		
		operator.setOperatorName("Operator1");
		operator.setResourceTableId(9);
		operatorService.saveOperator(operator);
		System.out.println("operator Saved Successfully!");*/
		
				
		User user1=userService.findById(new Long(9));
		Driver driver1 = driverService.findById(10);
		Operator operator1=operatorService.findById(11);
		
		System.out.println("User :"+ user1.getUserId() + "  " + user1.getUserName()
			+"\n Table :"+ driver1.getResourceTablename() +"Driver Name :" + driver1.getDriverName() + " Driver Table Id:" + driver1.getResourceTableId()
			+ "\n Operator Name: " + operator1.getOperatorName() +" Operator Table Id:" + operator1.getResourceTableId()
				
		);
		
		
	/*	UserResourcePeople userResourcePeople= new UserResourcePeople();
		userResourcePeople.setResourceType(driver1);
		userResourcePeople.setUser(user1);
		
		
		userResourcePeopleService.saveUserPeople(userResourcePeople);*/
		
		
	  }
	
	
	
		@RequestMapping(value = "/name")
	    String getName(@RequestParam Integer var) {
			
			System.out.println("hello ...." +var);
	        return "Required element of request param";
	    }
	
		
	
		@RequestMapping(value = "/getresource")
		public void getResource(@RequestParam Integer typeid) {
					
			List<AbstractBaseClass> resourceList =  baseClassService.getResourceList(typeid);
			
			for (AbstractBaseClass type:resourceList)
			{
				System.out.println("\n "+type);
			}
				
		} 
		
		
		
		
	
	
}
