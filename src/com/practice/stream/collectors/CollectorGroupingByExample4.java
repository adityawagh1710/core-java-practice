package com.practice.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
	int id;
	String status;
	
	Order(Integer id, String status) {
		this.id = id;
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public boolean isDelivered() {
		return this.getStatus().equals("DELIVERED");
	}
	
	@Override
	public String toString() {
		return "Order [status=" + status + "]";
	}
}

public class CollectorGroupingByExample4 {
	
	public static void main(String[] args) {
		List<Order> orders = List.of(
				new Order(101, "DELIVERED"),
				new Order(102, "PENDING"),
				new Order(103, "DELIVERED")
		);
		
		System.out.println("---map grouping by status ---");
		Map<String, List<Order>> grouped = orders
				.stream()
				.collect(Collectors.groupingBy(Order::getStatus));
		
		System.out.println(grouped);
		
		System.out.println("---map partitioning by status ---");
		Map<Boolean, List<Order>> resultIsDelivered = orders
				.stream()
				.collect(Collectors.partitioningBy(Order::isDelivered));
		
		System.out.println(resultIsDelivered);
	}
	
}
