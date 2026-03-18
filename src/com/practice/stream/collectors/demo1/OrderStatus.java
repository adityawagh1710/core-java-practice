package com.practice.stream.collectors.demo1;

public enum OrderStatus {
	PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED;
	
	public boolean isActive() {
		return this == PENDING || this == CONFIRMED || this == SHIPPED;
	}
}
