package com.practice.collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetUniqueAsListExample {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> unique = new HashSet<>();

        unique.addAll(Arrays.asList(arr1));
        unique.addAll(Arrays.asList(arr2));

        System.out.println(unique);
    }
}
