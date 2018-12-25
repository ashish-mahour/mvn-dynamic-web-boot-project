package com.mdwbp.dao;


import org.springframework.stereotype.Component;

import com.mdwbp.entity.Users;
@Component
public interface UsersDAO {
	public void saveUser(Users user);
}
