package com.practice.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetAsListExample {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {3, 4, 5, 6};

        LinkedHashSet<Integer> unique = new LinkedHashSet<>();

        unique.addAll(Arrays.asList(arr1));
        unique.addAll(Arrays.asList(arr2));

        System.out.println(unique);
    }
}
