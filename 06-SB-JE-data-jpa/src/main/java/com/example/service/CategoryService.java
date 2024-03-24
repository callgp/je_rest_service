package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Category;
import com.example.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public void createCategory(Category category) {
		categoryRepository.save(category);
		
		// assingment
		categoryRepository.saveAll(null);
		categoryRepository.count();
		categoryRepository.findAllById(null);
		categoryRepository.deleteById(null);
	}
	
	public void updateCategory(Integer id,Category inputCategory) {
		Category dbCategory = fetchCategory(id);
		dbCategory.setName(inputCategory.getName());
		categoryRepository.save(dbCategory);
	}
	
	public Category fetchCategory(Integer id) {
		Optional<Category> optional = categoryRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("Category Id Not exits in DB");
		}
	}
	
	public void deleteCategory(Integer id) {
		Category dbCategory = fetchCategory(id);
		categoryRepository.delete(dbCategory);
	}
	
}