package com.ramya.OrderService.service;

import com.ramya.OrderService.model.OrderRequest;

public interface OrderService {

	long placeOrder(OrderRequest orderRequest);

}
