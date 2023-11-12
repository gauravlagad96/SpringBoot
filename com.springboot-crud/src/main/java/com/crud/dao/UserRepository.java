package com.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	

}
