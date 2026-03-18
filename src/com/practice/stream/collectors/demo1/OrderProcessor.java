package com.practice.stream.collectors.demo1;

import java.util.*;
import java.util.stream.*;

public class OrderProcessor {
	
	public static void main(String[] args) {
		
		List<Product> products = List.of(
				new Product("Laptop",       75000, Category.ELECTRONICS),
				new Product("T-Shirt",        799, Category.CLOTHING),
				new Product("Java 21 Book",  1200, Category.BOOKS),
				new Product("Headphones",    3500, Category.ELECTRONICS),
				new Product("Rice Bag",       450, Category.FOOD),
				new Product("Jeans",         1800, Category.CLOTHING),
				new Product("Effective Java", 950, Category.BOOKS)
		);
		
		List<Order> orders = List.of(
				new Order(1, products.get(0), 1, OrderStatus.DELIVERED),
				new Order(2, products.get(1), 3, OrderStatus.SHIPPED),
				new Order(3, products.get(2), 2, OrderStatus.CONFIRMED),
				new Order(4, products.get(3), 1, OrderStatus.PENDING),
				new Order(5, products.get(4), 5, OrderStatus.CANCELLED),
				new Order(6, products.get(5), 2, OrderStatus.CONFIRMED),
				new Order(7, products.get(6), 1, OrderStatus.DELIVERED)
		);
		
		OrderFilter activeOnly = order -> order.getStatus().isActive();
		OrderFilter electronics = order -> order.getProduct().category() == Category.ELECTRONICS;
		OrderFilter highValue = order -> order.getTotal() > 2000;
		OrderFilter activeHighValue = activeOnly.and(highValue);
		
		PriceModifier tenPercentOff  = price -> price * 0.90;
		PriceModifier flatDiscount   = price -> Math.max(0, price - 200);
		
		OrderSummary printer = Order::toString;
		
		//STREAM EXAMPLE 1: filter + forEach
		System.out.println("=== Active, high-value orders ===");
		orders.stream()
				.filter(activeHighValue::test)   // uses composed OrderFilter
				.forEach(printer::print);         // uses OrderSummary
		
		
		//STREAM EXAMPLE 2: map with PriceModifier
		System.out.println("\n=== Discounted totals (10% off active orders) ===");
		orders.stream()
				.filter(activeOnly::test)
				.map(o -> {
					double discounted = tenPercentOff.apply(o.getTotal());
					return o.getProduct().name() + " → ₹" + discounted;
				})
				.forEach(System.out::println);
		
		
		//STREAM EXAMPLE 3: groupingBy Category using enum
		System.out.println("\n=== Orders grouped by product category ===");
		Map<Category, List<Order>> byCategory = orders.stream()
				.collect(Collectors.groupingBy(o -> o.getProduct().category()));
		
		byCategory.forEach((cat, list) -> {
			System.out.println(cat + ":");
			list.forEach(o -> System.out.println("  " + o));
		});
		
		
		//STREAM EXAMPLE 4: groupingBy OrderStatus enum
		System.out.println("\n=== Order count per status ===");
		Map<OrderStatus, Long> countByStatus = orders.stream()
				.collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
		
		// EnumMap keeps status in declaration order
		new EnumMap<>(countByStatus)
				.forEach((status, count) -> System.out.println("  " + status + ": " + count));
		
		
		//STREAM EXAMPLE 5: revenue per category
		System.out.println("\n=== Total revenue per category ===");
		orders.stream()
				.filter(o -> o.getStatus() != OrderStatus.CANCELLED)
				.collect(Collectors.groupingBy(
						o -> o.getProduct().category(),
						Collectors.summingDouble(Order::getTotal)
				))
				.forEach((cat, revenue) ->
						System.out.printf("  %-15s ₹%.2f%n", cat, revenue));
		
		
		//STREAM EXAMPLE 6: find most expensive active order
		System.out.println("\n=== Most expensive active order ===");
		orders.stream()
				.filter(activeOnly::test)
				.max(Comparator.comparingDouble(Order::getTotal))
				.ifPresent(o -> System.out.println("  " + o));
		
		
		//STREAM EXAMPLE 7: switch expression on enum status
		System.out.println("\n=== Status priority tags ===");
		orders.stream()
				.map(o -> {
					String tag = switch (o.getStatus()) {
						case PENDING   -> "[!] Needs confirmation";
						case CONFIRMED -> "[>] Ready to ship";
						case SHIPPED   -> "[~] In transit";
						case DELIVERED -> "[✓] Complete";
						case CANCELLED -> "[x] Cancelled";
					};
					return "Order#" + o.getId() + " " + tag;
				})
				.forEach(System.out::println);
		
		
		//STREAM EXAMPLE 8: partition by delivery status
		System.out.println("\n=== Delivered vs not delivered ===");
		Map<Boolean, List<Order>> deliveredPartition = orders.stream()
				.collect(Collectors.partitioningBy(
						o -> o.getStatus() == OrderStatus.DELIVERED
				));
		
		System.out.println("Delivered : " + deliveredPartition.get(true).size());
		System.out.println("Pending   : " + deliveredPartition.get(false).size());
		
		
		//STREAM EXAMPLE 9: summary statistics on order totals
		System.out.println("\n=== Order value statistics ===");
		DoubleSummaryStatistics stats = orders.stream()
				.filter(o -> o.getStatus() != OrderStatus.CANCELLED)
				.mapToDouble(Order::getTotal)
				.summaryStatistics();
		
		System.out.printf("  Count: %d | Min: ₹%.2f | Max: ₹%.2f | Avg: ₹%.2f%n",
				stats.getCount(), stats.getMin(), stats.getMax(), stats.getAverage());
	}
}