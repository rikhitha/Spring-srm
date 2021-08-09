package com.javatpoint.service;

import java.util.List;
import java.util.Optional;

import com.javatpoint.model.UserInfo;
import com.javatpoint.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userManagerImpl {
    @Autowired
	private UserRepo repo;
	
    public Optional<UserInfo> getone(int id)
    {
    	return repo.findById(id);
    }
	
	 public List<UserInfo> getUser() {
	        return repo.findAll();
	    }

    public void saveUser(UserInfo user) {
         repo.save(user);
    	}
}
