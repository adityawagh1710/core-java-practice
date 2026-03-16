package com.practice.interfaces.methodref;

import java.util.function.Function;
import java.util.function.Predicate;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isAdult() {
		return age >= 18;
	}
}

public class MethodRefWithAnyObject {
	public static void main(String[] args) {
		
		// Example 1: String methods
		Function<String, Integer> length = String::length;          // s -> s.length()
		Predicate<String> isEmpty = String::isEmpty;                // s -> s.isEmpty()
		Function<String, String> trim = String::trim;               // s -> s.trim()
		
		System.out.println(length.apply("Java"));         // 4
		System.out.println(isEmpty.test(""));             // true
		System.out.println(trim.apply("  hi  "));         // "hi"
		
		// Example 2: Our own class
		Person p = new Person("Anna", 25);
		
		Function<Person, String> getName = Person::getName;   // p -> p.getName()
		Predicate<Person> isAdult = Person::isAdult;          // p -> p.isAdult()
		
		System.out.println(getName.apply(p));       // Anna
		System.out.println(isAdult.test(p));        // true
	}
}