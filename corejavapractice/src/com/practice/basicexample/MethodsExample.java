package com.practice.basicexample;

public class MethodsExample {
    static void greet() {  
        System.out.println("Hello from the static method!");  
    }  
    public void farewell() {  
        System.out.println("Goodbye from a non-static method!");  
    }  
    public static void main(String args[]) {  
        MethodsExample obj = new MethodsExample();
        obj.farewell();
        MethodsExample.greet();
    }  
}  