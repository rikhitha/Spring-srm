package com.javatpoint.repository;

import org.springframework.stereotype.Repository;

import com.javatpoint.model.UserInfo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepo extends JpaRepository<UserInfo,Integer>
{
	
	@Query("SELECT u FROM UserInfo u WHERE u.userId= 1")
	List<UserInfo> findAll();
}