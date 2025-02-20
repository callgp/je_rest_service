package com.je.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.je.collections.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

	List<Product> findByStatus(String status);
}
