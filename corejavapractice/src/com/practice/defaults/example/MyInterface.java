package com.practice.defaults.example;

interface MyInterface {
    void greet();
    default void sayHello() {
        System.out.println("Hello from default method!");
    }
}
