package com.practice.collections;

import java.util.ArrayList;

public class SimpleUserModelArrayListExample {
    public static void main(String[] args) {

        ArrayList<SimpleUserModelExample> users = new ArrayList<>();

        users.add(new SimpleUserModelExample(1, "Aditya"));
        users.add(new SimpleUserModelExample(2, "Akshay"));
        users.add(new SimpleUserModelExample(3, "Shivam"));

        for (SimpleUserModelExample user : users) {
            System.out.println(user.id + " " + user.name);
        }
    }
}
