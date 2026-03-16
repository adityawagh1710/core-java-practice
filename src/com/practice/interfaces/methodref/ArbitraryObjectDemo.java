package com.practice.interfaces.methodref;

import java.util.function.Function;

class TextUtils {
	
	public String convertUpper(String text) {
		return text.toUpperCase();
	}
}

public class ArbitraryObjectDemo {
	
	public static void main(String[] args) {
		
		TextUtils util = new TextUtils();
		
		Function<String, String> convert = util::convertUpper;
		
		System.out.println(convert.apply("Example for Arbitrary Object"));
	}
}
