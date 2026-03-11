package com.practice.defaultexample;

interface MyInterface {
    void greet();
    default void sayHello() {
        System.out.println("Hello from default method!");
    }
}
