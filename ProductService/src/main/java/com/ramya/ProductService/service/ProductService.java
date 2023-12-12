package com.ramya.ProductService.service;

import java.util.List;

import com.ramya.ProductService.model.ProductRequest;
import com.ramya.ProductService.model.ProductResponse;

public interface ProductService {

	long addProduct(ProductRequest productRequest);

	ProductResponse getProductById(Long productId);

	List<ProductResponse> getAllProducts();

	boolean deleteProductById(Long productId);

}
