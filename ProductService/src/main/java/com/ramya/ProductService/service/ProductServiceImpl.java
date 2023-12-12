package com.ramya.ProductService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ramya.ProductService.entity.Product;
import com.ramya.ProductService.exception.ProductServiceCustomException;
import com.ramya.ProductService.model.ProductRequest;
import com.ramya.ProductService.model.ProductResponse;
import com.ramya.ProductService.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public long addProduct(ProductRequest productRequest) {
        log.info("Adding Product...");

        Product product         		
        		= Product.builder()
                .productName(productRequest.getProductName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);

        log.info("Product Created");
        return product.getProductId();
    }

    public ProductResponse getProductById(Long productId) {
        log.info("Fetching product for productId: {}", productId);

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductServiceCustomException("Product with given id not found", "PRODUCT-NOT-FOUND"));

        ProductResponse productResponse = new ProductResponse();
        productResponse.setProductId(product.getProductId());
        productResponse.setProductName(product.getProductName());
        productResponse.setQuantity(product.getQuantity());
        productResponse.setPrice(product.getPrice());
        return productResponse;
    }
    
    @Override
    public List<ProductResponse> getAllProducts() {
        log.info("Fetching all products");

        List<Product> products = productRepository.findAll();
        List<ProductResponse> productResponses = new ArrayList<>();

        for (Product product : products) {
            ProductResponse productResponse = new ProductResponse();
            BeanUtils.copyProperties(product, productResponse);
            productResponses.add(productResponse);
        }

        return productResponses;
    }
    
    @Override
    public boolean deleteProductById(Long productId) {
        Optional<Product> productOptional = productRepository.findById(productId);
        if (productOptional.isPresent()) {
            productRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}
