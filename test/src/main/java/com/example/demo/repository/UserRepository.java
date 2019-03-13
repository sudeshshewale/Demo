package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.hibernate.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("SELECT U FROM User U where U.id = :id")
	public User findUserByUserId(@Param("id") long id);
	
	public User findById(long id);

}
