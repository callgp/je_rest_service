package com.je;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.je.entities.Product;
import com.je.entities.User;
import com.je.repository.ProductRepository;
import com.je.repository.UserRepository;

@SpringBootApplication
public class Application implements ApplicationRunner {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		saveProduct();
		//not tested
		saveAllProduct();
		updateProduct();
		productRepository.deleteById(7);
		saveUser();
		updateUser();
		userRepository.deleteById(7);
		
		existsByIdProduct();
		//deleteUser();
	}

	private void existsByIdProduct() {
		boolean value= productRepository.existsById(10);
		System.out.println("value is"+value);
	}
//tested
	private void saveProduct() {
		Product p=new Product();
		//p.setName("gp");
		p.setId(1234);
		p.setName("xxyz");
		//p.se
		productRepository.save(p);
	}
	
	
	  private void saveAllProduct() {
		  List list=new ArrayList<>();
		  Product p=new Product(); //p.setName("gp");
	
	  p.setId(12345); 
	  p.setName("xxyzzz"); 
	  //Iterable p1 = null; 
	  Product p1=new Product(); //p.setName("gp");
	  p1.setId(123456); 
	  p1.setName("xxyzzzzzx");
	  //((List) p1).add(p);
	  
	  //p.se //productRepository. productRepository.saveAll(p1); }
	  list.add(p);
	  list.add(p1);
	  productRepository.saveAll(list);
	  }
	//tested
	private void updateProduct() {
		/*
		 * Product p=new Product(); //p.setName("gp"); p.setId(1234);
		 * p.setName("xxxyyyz"); //p.se productRepository.update(p);
		 */
		productRepository.findById(2).map(p ->{
			p.setName("modified");
			productRepository.save(p);
			return p;
		}).orElseThrow(()->new RuntimeException("product not in db"+2));
	}
	
	/*
	 * private void deleteProduct() { Product p=new Product(); //p.setName("gp");
	 * p.setId(1234); p.setName("xxxyyyz"); //p.se //productRepository.update(p); }
	 */
	//testeds
	private void saveUser() {
		User user=new User();
		//p.setName("gp");
		user.setId(1234);
		user.setName("user123");
		//p.se
		userRepository.save(user);
	}
	private void updateUser() {
		User user=new User();
		/*
		 * //p.setName("gp"); user.setId(1234); user.setName("user123"); //p.se
		 * userRepository.save(user);
		 */
		
		userRepository.findById(2).map(p ->{
			p.setName("modified user");
			userRepository.save(p);
			return p;
		}).orElseThrow(()->new RuntimeException("product not in db"+2));
	}
	
	/*
	 * private void deleteUser() { User user=new User(); //p.setName("gp");
	 * user.setId(1234); user.setName("user123"); //p.se userRepository.save(user);
	 * }
	 */
}
