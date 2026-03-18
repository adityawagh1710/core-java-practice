package com.practice.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamCollectorListExample1 {
	public static void main(String[] args) {
		
		List<String> users = List.of("Amit", "Rahul", "Neha");
		
		List<String> result = users.stream().collect(Collectors.toList());
		
		System.out.println(result);
	}
}
