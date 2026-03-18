package com.practice.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicStreamCollectorMapExample2 {
	public static void main(String[] args) {
		List<String> products = List.of("Laptop", "Mobile");
		
		Map<String, Integer> map = products
				.stream()
				.collect(Collectors.toMap(p -> p, String::length));
		
		System.out.println(map);
	}
}
