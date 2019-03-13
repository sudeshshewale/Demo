package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.User;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
	/*
	
	@Query("SELECT D FROM Driver D where D.resourceTypeId = :id")
	public Driver findDriverByDriverId(@Param("id") int id);

*/
	}
