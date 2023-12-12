package com.ramya.OrderService.controller;

import com.ramya.OrderService.model.OrderRequest;
import com.ramya.OrderService.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/order")
@Log4j2
public class OrderController {
	//create the object of the business layer
	@Autowired
	private OrderService orderService;
	
	//create a method for creating the order
	@PostMapping("/placeOrder")
	public ResponseEntity<Long> placeOrder(@RequestBody OrderRequest orderRequest){
		long orderId=orderService.placeOrder(orderRequest);
		log.info("Order Id:{}",orderId);
		return new ResponseEntity<>(orderId,HttpStatus.OK );
		

}
}

