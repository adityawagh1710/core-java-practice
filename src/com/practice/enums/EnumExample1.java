package com.practice.enums;

enum OrderStatus {
	PLACED,
	PROCESSING,
	SHIPPED,
	DELIVERED,
	CANCELLED
}

class OrderService {
	public void printStatus(OrderStatus status) {
		switch (status) {
			case PLACED:
				System.out.println("Order placed successfully");
				break;
			case SHIPPED:
				System.out.println("Order is on the way");
				break;
			case DELIVERED:
				System.out.println("Order delivered");
				break;
			default:
				System.out.println("Other status");
		}
	}
}

public class EnumExample1 {
	
	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		orderService.printStatus(OrderStatus.PLACED);
	}
}
