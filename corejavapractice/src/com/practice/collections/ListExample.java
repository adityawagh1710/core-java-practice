package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // 1: LHS preferred for generics RHS not needed
        // 2: ArrayList implements List so can be used
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        list.getLast();

        System.out.println(list);
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
    }
}
