package com.je.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.je.entities.Product;

@Repository //optional
public interface ProductRepository extends JpaRepository<Product, Integer>{

}