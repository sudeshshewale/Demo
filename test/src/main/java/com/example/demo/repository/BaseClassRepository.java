package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.hibernate.entity.AbstractBaseClass;

public interface BaseClassRepository extends JpaRepository<AbstractBaseClass, Integer>{
	

/*	@Query("SELECT A FROM AbstractBaseClass A WHERE A.resourceTableId = :id")
	public List<AbstractBaseClass> getResourceList(@Param("id") int id);*/
	
	
	//public AbstractBaseClass findByUserId(Long id);
	
	

}
