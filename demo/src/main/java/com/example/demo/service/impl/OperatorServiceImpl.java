package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.hibernate.entity.Operator;
import com.example.demo.hibernate.entity.User;
import com.example.demo.repository.OperatorRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.OperatorService;

@Service
public class OperatorServiceImpl implements OperatorService {
	
	@Autowired
	OperatorRepository operatorRepository;
	
	
	@Override
		public boolean saveOperator(Operator operator) {
			operatorRepository.save(operator);
			
			System.out.println("Data not saved");
			return false;
		}
	
	
	@Override
	public Operator findById(int id) {
		
		return operatorRepository.findOperatorByOperatorId(id);
		 
	}


}
