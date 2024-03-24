package com.je.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.je.entities.Category;
import com.je.entities.Product;

@Repository //optional
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}