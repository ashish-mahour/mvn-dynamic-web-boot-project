package com.mdwbp.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mdwbp.entity.Users;

@Repository
@Transactional
public interface UsersRepo extends CrudRepository<Users, Integer> {
}
