package com.je.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.je.collections.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}