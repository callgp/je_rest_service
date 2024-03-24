package com.je.listener;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.je.collections.Product;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsunerProductListener {
	
	@KafkaListener(topics="PRODUCER_TOPIC", groupId="consumer_products")
	public void consumeProduct(@Payload List<Product> products) {
		log.info("received orignal msg {}",products);
		products.forEach(p -> System.out.println(p));
	}

}
