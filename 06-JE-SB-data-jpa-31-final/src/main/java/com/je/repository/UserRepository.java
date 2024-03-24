package com.je.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.je.entities.Product;
import com.je.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}