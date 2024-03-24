package com.je.service;

import org.springframework.stereotype.Service;

import com.je.collections.Product;
import com.je.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

}
