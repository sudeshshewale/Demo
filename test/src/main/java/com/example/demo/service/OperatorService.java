package com.example.demo.service;

import com.example.demo.hibernate.entity.Operator;

public interface OperatorService {

	public boolean saveOperator(Operator operator);
	
	public Operator findById(int id);
}
