package com.example.demo.controller;

import java.util.ArrayList;
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
import com.example.demo.hibernate.entity.ResourceRight;
import com.example.demo.hibernate.entity.User;
import com.example.demo.service.BaseClassService;
import com.example.demo.service.DriverService;
import com.example.demo.service.OperatorService;
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
	BaseClassService baseClassService;
	
	
	

	@RequestMapping(value = "/name")
    String getName(@RequestParam Integer var) {
		
		System.out.println("hello ...." +var);
        return "Required element of request param";
    }
	
	@RequestMapping(value = "/saveuser")
	  public void createEntity() {
		
		System.out.println("\n Inside Save user...");
		
		
		User user = new User();
		user.setUserName("Newton");
		userService.saveUserDetail(user); 
		System.out.println("User Saved Successfully!");
		
		
		
		Driver driver=new Driver();
		driver.setDriverName("Driver2");
		driver.setResourceTableId(8);
		//driver.setUser(user);
		driver.setResourceTablename("Driver");
		driverService.saveDriver(driver);
		System.out.println("driver Saved Successfully!"); 
		
	/*	Driver driver=new Driver();
		
		driver.setId(id);
		driver.setResourceTableId(8);
		
		user.setResource(driver); */
		
		
		Operator operator=new Operator();
		operator.setOperatorName("Operator2");
		operator.setResourceTableId(9);
		//operator.setUser(user);
		operator.setResourceTablename("Operator");
		operatorService.saveOperator(operator);
		System.out.println("operator Saved Successfully!");
		
		
		// -------- RESOURCE RIGHTS
		
		ResourceRight resRight = new ResourceRight();
		resRight.setIndoor("Y");
		resRight.setOutdoor("Y");
	  }
	
	
	@RequestMapping(value = "/getresource")
	public void getResource(@RequestParam Long userid) {
		
		Optional<User> type = userService.findById(userid);
		User user=type.get();	
		
	/*	System.out.println("\n User Name:"+user.getUserName()
							+ "\n Resource type: " +user.getResource().getResourceTablename()
							);*/
		
		AbstractBaseClass driver=new Driver();
		driver.setId(13);
		
		ResourceRight resRight = new ResourceRight();
		resRight.setId(new Long(1));
		
		ResourceRight resRight2 = new ResourceRight();
		resRight2.setId(new Long(2));
		
		List<ResourceRight> resRightsList = new ArrayList<>();
		resRightsList.add(resRight);
		resRightsList.add(resRight2);
		
		user.setResourceRights(resRightsList);
		user.setResource(driver);
		userService.saveUserDetail(user); 
		System.out.println("User Saved Successfully!");
		
		System.out.println("...."+type.getClass().toString());
		//List<AbstractBaseClass> resourceList =  baseClassService.findByUserId(typeid);
		
		//AbstractBaseClass type = baseClassService.findByUserId(userid);
		
		/*	System.out.println("\n Table Id:"+ type.getResourceTableId());
			
			if(type instanceof Driver){
			 
				Driver dObj = (Driver)type ;
				System.out.println("\n Driver Name:" +dObj.getDriverName());
			}else if (type instanceof Operator) {
				Operator operator = (Operator)type;
				System.out.println("\n Operator Name:" +operator.getOperatorName());
			}*/
			
			
		 
	
	}
	
		
	
		
		
	
	
}
