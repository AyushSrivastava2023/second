package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nagarro.model.Users;


public interface UserRepo extends JpaRepository<Users,String>{

}
