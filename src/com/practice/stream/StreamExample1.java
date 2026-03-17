package com.practice.stream;

import java.util.List;
import java.util.Optional;

public class StreamExample1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("--Filter-------");
		// Filter is intermediate operation which accepts predicate
		numbers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		
		System.out.println("--Map-------");
		// map is intermediate operation which accepts function
		numbers.stream().map(e -> e * e).forEach(System.out::println);
		
		System.out.println("--Sorted-------");
		// sorted is intermediate operation without import
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("--Count-------");
		long count = numbers.stream().count();
		System.out.println(count);
		
		System.out.println("--indFirst using optional-------");
		Optional<Integer> first = numbers.stream().findFirst();
		first.ifPresent(System.out::println);
	}
}
