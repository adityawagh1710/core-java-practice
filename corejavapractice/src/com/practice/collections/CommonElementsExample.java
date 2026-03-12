package com.practice.collections;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementsExample {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4,5,6};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        set1.retainAll(set2);

        System.out.println(set1);
    }
}
