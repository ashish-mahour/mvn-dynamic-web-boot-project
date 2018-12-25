package com.mdwbp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Repository;

import com.mdwbp.entity.Users;
@Component
@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
}
