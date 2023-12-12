package com.ramya.OrderService.service;

import java.time.Instant;

import com.ramya.OrderService.entity.OrderEntity;
import com.ramya.OrderService.model.OrderRequest;
import com.ramya.OrderService.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2

public class OrderServiceImpl implements OrderService {
	
	//object of the repository layer
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public long placeOrder(OrderRequest orderRequest) {
	    log.info("Placing Order Request: {}", orderRequest);

	    OrderEntity order = OrderEntity.builder()
	            .amount(orderRequest.getTotalAmount())
	            .orderStatus("CREATED")
	            .productId(orderRequest.getProductId())
	            .orderDate(Instant.now())
	            .quantity(orderRequest.getQuantity())
	            .build();

	    order = orderRepository.save(order);
	    
	    log.info("Order Placed Successfully with orderId: {}", order.getId());
	    return order.getId(); // Return the order ID after saving the order
	}
}

