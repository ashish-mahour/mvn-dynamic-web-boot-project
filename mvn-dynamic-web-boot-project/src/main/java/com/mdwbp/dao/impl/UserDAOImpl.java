package com.mdwbp.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mdwbp.dao.UsersDAO;
import com.mdwbp.entity.Users;
import com.mdwbp.repo.UsersRepo;

@Service
public class UserDAOImpl implements UsersDAO{
	
	@Autowired
	private UsersRepo userRepo;

	@Override
	public void saveUser(Users user) {
		userRepo.save(user);
	}

}
