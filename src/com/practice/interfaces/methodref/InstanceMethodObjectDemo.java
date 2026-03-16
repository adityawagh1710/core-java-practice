package com.practice.interfaces.methodref;

import java.util.function.Consumer;

class Printer {
	
	public void printMessage(String msg) {
		System.out.println("Message: " + msg);
	}
}

public class InstanceMethodObjectDemo {
	
	public static void main(String[] args) {
		
		Printer printer = new Printer();
		
		Consumer<String> consumer = printer::printMessage;
		
		consumer.accept("Example for Instance Method");
	}
}
