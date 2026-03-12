package com.practice.collections;

import java.util.*;

public class IteratorHasNextExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);
        }
    }
}
