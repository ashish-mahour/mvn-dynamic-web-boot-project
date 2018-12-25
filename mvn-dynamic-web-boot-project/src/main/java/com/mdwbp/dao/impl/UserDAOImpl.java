package com.mdwbp.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mdwbp.dao.UsersDAO;
import com.mdwbp.entity.Users;
import com.mdwbp.repo.UsersRepo;
@Component
@Service
@Transactional
public class UserDAOImpl implements UsersDAO{
	
	@Autowired
	private UsersRepo userRepo;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void saveUser(Users user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		userRepo.save(user);
		entityManager.getTransaction().commit();
		entityManager.flush();
		entityManager.close();
		entityManagerFactory.close();
	}

}
