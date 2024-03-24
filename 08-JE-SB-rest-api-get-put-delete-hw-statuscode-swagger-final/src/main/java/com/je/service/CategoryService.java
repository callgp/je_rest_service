package com.je.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.je.entities.Category;
import com.je.entities.Product;
import com.je.repository.CategoryRepository;
import com.je.repository.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category createCategory(Category category) {
		Category dbCategory=categoryRepository.save(category);
		return dbCategory;
		
	}
	public Category fetchCategory(Integer id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id)
		.orElseThrow(()-> new RuntimeException("Category not there in db"));
	}
	public Category updateCategory(Integer id, Category inputCategory) {
		// TODO Auto-generated method stub
		Category fetchDatabaseProduct = fetchCategory(id);
		fetchDatabaseProduct.setName(inputCategory.getName());
		Category result=categoryRepository.save(fetchDatabaseProduct);
		return result;
	}
	public void deleteCategory(Integer categoryId) {
		boolean isExists = categoryRepository.existsById(categoryId);
		if(isExists) {
			categoryRepository.deleteById(categoryId);
		} else {
			throw new RuntimeException("Category record not in the databases");
		}
	}
}
