package com.ramya.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductRequest {
	
	private String productName;
	private long price;
	private long quantity;
//	public String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	public long getQuantity() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public long getPrice() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	

}
