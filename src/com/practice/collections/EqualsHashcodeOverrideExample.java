package com.practice.collections;

import java.util.HashMap;
import java.util.Objects;

class Student {
	
	int id;
	String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(this == obj)
			return true;
		
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Student s = (Student) obj;
		
		return id == s.id;
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(id);
	}
}

public class EqualsHashcodeOverrideExample {
	
	public static void main(String[] args){
		Student s1 = new Student(1,"Aditya");
		Student s2 = new Student(1,"Shivam");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		// HashMap object iteration
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		System.out.println(map.get(1).getName());
	}
}