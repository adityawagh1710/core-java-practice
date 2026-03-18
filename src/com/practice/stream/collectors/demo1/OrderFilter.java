package com.practice.stream.collectors.demo1;

@FunctionalInterface
public interface OrderFilter {
	boolean test(Order order);
	
	// Default method for composing filters with AND
	default OrderFilter and(OrderFilter other) {
		return order -> this.test(order) && other.test(order);
	}
}
