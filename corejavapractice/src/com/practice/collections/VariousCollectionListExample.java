package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VariousCollectionListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= 20; i++) {
            numbers.add(i);
        }

        // sublist of List
        List<Integer> firstTen = numbers.subList(0, 10);
        System.out.println("All : " + numbers);
        System.out.println("First Ten : " + firstTen);

        // reverse of Collections
        Collections.reverse(numbers);
        System.out.println("Reverse all numbers : " + numbers);

        // hasNext and next of Iterator
        Iterator<Integer> it = numbers.iterator();

        int index = 0;

        while(it.hasNext()) {

            int value = it.next();

            if (index % 2 == 0) {
                System.out.println(value);
            }

            index++;
        }
    }
}
