package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.hibernate.entity.Driver;
import com.example.demo.hibernate.entity.UserResourceType;

public interface UserResourceTypeRepository extends JpaRepository<UserResourceType, Integer>  {

}
