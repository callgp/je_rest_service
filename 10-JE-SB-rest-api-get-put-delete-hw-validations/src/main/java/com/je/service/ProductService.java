package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.je.entities.Product;
import com.je.exception.ResourceNotFoundException;
import com.je.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	public Product createProduct(Product product) {
		Product dbProduct=productRepository.save(product);
		return dbProduct;
		
	}
	public Product fetchProduct(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id)
		.orElseThrow(()-> new ResourceNotFoundException("Product not there in db"));
	}
	public Product updateProduct(Integer id, Product inputProduct) {
		// TODO Auto-generated method stub
		Product fetchDatabaseProduct = fetchProduct(id);
		fetchDatabaseProduct.setName(inputProduct.getName());
		Product result=productRepository.save(fetchDatabaseProduct);
		return result;
	}
	public void deleteProduct(Integer productId) {
		boolean isExists = productRepository.existsById(productId);
		if(isExists) {
			productRepository.deleteById(productId);
		} else {
			throw new RuntimeException("record not in the databases");
		}
	}
}
