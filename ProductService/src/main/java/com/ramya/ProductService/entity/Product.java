package com.ramya.ProductService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data//(lombok instead of getter and setter)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="QUANTITY")
	private long quantity;
	@Column(name="PRICE")
	private long price;
	
	
}
