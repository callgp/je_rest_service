package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.je.entities.Product;
import com.je.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	public Product createProduct(Product product) {
		Product dbProduct=productRepository.save(product);
		return dbProduct;
		
	}
}
