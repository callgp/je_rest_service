package com.je.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "products")
public class Product {

	@Id
	private String id; // _id

	@Field("pname")
	private String name;

	private Double price;

	private boolean active;

	private String description;

	private Status status;

	private Category category;
}
