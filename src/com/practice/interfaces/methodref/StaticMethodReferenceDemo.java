package com.practice.interfaces.methodref;

import java.util.function.Function;

class MathOperations {
	
	public static int square(int n) {
		return n * n;
	}
}

public class StaticMethodReferenceDemo {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> squareFunction = MathOperations::square;
		
		System.out.println(squareFunction.apply(6));
	}
}
