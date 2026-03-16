package com.practice.interfaces.methodref;

import java.util.function.Supplier;

class Student {
	
	public Student() {
		System.out.println("Student object created");
	}
}

public class ConstructorReferenceDemo {
	
	public static void main(String[] args) {
		
		Supplier<Student> supplier = Student::new;
		
		supplier.get();
	}
}
