package com.practice.interfaces.methodref;

interface PassChecker {
	boolean check(Student2 s, int passMarks);
}

class Student2 {
	private int marks;
	
	Student2(int marks) {
		this.marks = marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public boolean hasPassed(int passMarks) {
		return marks >= passMarks;
	}
}

public class CustomArbitraryObjectDemo {
	
	public static void main(String[] args) {
		
		PassChecker passChecker = Student2::hasPassed;
		
		Student2 student1 = new Student2(10);
		
		System.out.println(passChecker.check(student1, 45));
	}
}
