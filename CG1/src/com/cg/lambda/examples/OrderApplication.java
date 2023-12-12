package com.cg.lambda.examples;

	import java.util.ArrayList;
	import java.util.List;

	public class OrderApplication {

	    static class Order {
	        private int orderId;
	        private double price;
	        private String status;

	        public Order(int orderId, double price, String status) {
	            this.orderId = orderId;
	            this.price = price;
	            this.status = status;
	        }

	        public int getOrderId() {
	            return orderId;
	        }

	        public double getPrice() {
	            return price;
	        }

	        public String getStatus() {
	            return status;
	        }
	    }

	    @FunctionalInterface
	    interface OrderFilter {
	        boolean check(Order order);
	    }

	    public static void main(String[] args) {
	        List<Order> orders = new ArrayList<>();
	        orders.add(new Order(1, 5000.0, "accepted"));
	        orders.add(new Order(2, 15000.0, "completed"));
	        orders.add(new Order(3, 8000.0, "accepted"));
	        orders.add(new Order(4, 12000.0, "pending"));

	        OrderFilter filter = order -> order.getPrice() > 10000 && (order.getStatus().equals("accepted") || order.getStatus().equals("completed"));

	        for (Order order : orders) {
	            if (filter.check(order)) {
	                System.out.println("Order ID: " + order.getOrderId() + ", Price: $" + order.getPrice() + ", Status: " + order.getStatus());
	            }
	        }
	    }
	}


