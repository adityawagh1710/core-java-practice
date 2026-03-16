package com.practice.interfaces.predefined;

import java.util.function.Consumer;

public class ConsumerExample1 {
	public static void main(String[] args) {
		// Integer
		Consumer<Integer> printer = System.out::println;
		printer.accept(1);
		printer.accept(2);
		
		// String
		Consumer<String> printer2 = System.out::println;
		printer2.accept("Hi");
		printer2.accept("This is example consumer interface");
		
		// Array
		Consumer<Integer> printNumber = n -> System.out.println("Number: " + n);
		int[] numbers = {5, 10, 15, 20};
		
		for(int num : numbers) {
			printNumber.accept(num);
		}
	}
}
