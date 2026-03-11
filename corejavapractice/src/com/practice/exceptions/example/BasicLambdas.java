package com.practice.exceptions.example;

import java.util.Comparator;
import java.util.function.*;

public class BasicLambdas {
    public static void main(String[] args) {

        // 1. Runnable — no input, no output
        Runnable greet = () -> System.out.println("Hello, Java!");
        greet.run();

        // 2. Predicate — takes input, returns true/false
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));  // true
        System.out.println(isEven.test(7));  // false

        // 3. Function — takes input, returns output
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Hello"));  // 5

        // 4. Consumer — takes input, returns nothing
        Consumer<String> print = s -> System.out.println("Value: " + s);
        print.accept("Java");  // Value: Java

        // 5. Supplier — no input, returns a value
        Supplier<String> message = () -> "Good morning!";
        System.out.println(message.get());  // Good morning!

        // 6. BiFunction — takes two inputs, returns output
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));  // 8

        // 7. Comparator — compare two values
        Comparator<String> byLength = (a, b) -> a.length() - b.length();
        System.out.println(byLength.compare("Hi", "Hello"));  // negative = "Hi" is shorter
    }
}
