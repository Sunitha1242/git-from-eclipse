package com.ramya.ProductService.controller;

import java.util.List;

import com.ramya.ProductService.model.ProductRequest;
import com.ramya.ProductService.model.ProductResponse;
import com.ramya.ProductService.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:8081")
public class ProductController {
	@Autowired
	private ProductService productService;

	@PostMapping
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest) {
		long productId = productService.addProduct(productRequest);
		return new ResponseEntity<>(productId, HttpStatus.CREATED);

	}
	  @GetMapping("/{id}") 
	  public ResponseEntity<ProductResponse>getProductById(@PathVariable("id")Long
	  productId){ ProductResponse productResponse
		  	= productService.getProductById(productId); 
	  return new ResponseEntity<>(productResponse,HttpStatus.OK);
	  }
	  
	  @GetMapping("/all")
	    public ResponseEntity<List<ProductResponse>> getAllProducts() {
	        List<ProductResponse> productResponses = productService.getAllProducts();
	        return new ResponseEntity<>(productResponses, HttpStatus.OK);
	  
	  }
	  @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteProductById(@PathVariable("id") Long productId) {
	        boolean deleted = productService.deleteProductById(productId);
	        if (deleted) {
	            return new ResponseEntity<>("Product with ID " + productId + " deleted successfully.", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Product with ID " + productId + " not found.", HttpStatus.NOT_FOUND);
	        }
	    }
	}

