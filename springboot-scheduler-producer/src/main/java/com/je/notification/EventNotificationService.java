package com.je.notification;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.je.collections.Product;
import com.je.collections.Status;
import com.je.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EventNotificationService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private KafkaTemplate<String, Product> kafkaTemplate;
	public void processChangeNotification() {
		List<Product> productList = productRepository.findByStatus("NEW");
		if(productList.isEmpty()) {
			log.info("No Messages to Process");
			return ;
		}
		log.info("Total Products Received {} ",productList.size());
		// send products to Kafka (JSON)
		// send products to MQ (XML)
		sendKafkaNotification(productList);
		updateStatus(productList);
	}

	

	private void sendKafkaNotification(List<Product> productList) {
		// TODO Auto-generated method stub
		productList.forEach(product ->{
			kafkaTemplate.send("PRODUCER_TOPIC",product);
			System.out.println("completed");
		});
		System.out.println("kafka success");
		
	}



	private void updateStatus(List<Product> productList) {
		productList.stream().forEach(obj -> {
			obj.setStatus(Status.PROCESSED);
		});
		List<Product> updatedProductList = productRepository.saveAll(productList);
		log.info("Record Status Updated in DB {} ",updatedProductList.size());
	}

	
}
