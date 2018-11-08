package com.mdwbp.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mdwbp.dao.UsersDAO;
import com.mdwbp.entity.Users;

@Repository
public class UserDAOImpl implements UsersDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean save(Users user) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
		session.close();
		return false;
	}

}
