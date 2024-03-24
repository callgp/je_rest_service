package com.je.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.je.entities.Product;
import com.je.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public Product CreateProduct(@RequestBody @Valid Product product) {
		return productService.createProduct(product);
	}
	
	@GetMapping("/fetch/{id}")
	public Product fetchProduct(@PathVariable Integer id) {
		return productService.fetchProduct(id);
	}
	
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable Integer id,@RequestBody Product product) {
		return productService.updateProduct(id,product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable(value="id") Integer productId) {
		productService.deleteProduct(productId);
	}
}
