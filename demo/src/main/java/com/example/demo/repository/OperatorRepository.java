package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator, Integer>  {
	
	@Query("SELECT O FROM Operator O where O.resourceTypeId = :id")
	public Operator findOperatorByOperatorId(@Param("id") int id);

}
