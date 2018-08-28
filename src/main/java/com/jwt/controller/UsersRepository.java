package com.jwt.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.Users;

public interface UsersRepository extends JpaRepository<Users,Long>{

	boolean existsByUserName(String username);

}
