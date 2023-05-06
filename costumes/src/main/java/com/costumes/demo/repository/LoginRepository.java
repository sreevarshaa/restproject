package com.costumes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.costumes.demo.model.Login;

public interface LoginRepository extends JpaRepository<Login,Integer>{
	
	Login findByUsername(String username);

}
