package com.practice.collections;

import java.util.ArrayList;

public class UserModelArrayListExample {
    public static void main(String[] args) {

        ArrayList<UserModelExample> users = new ArrayList<>();

        users.add(new UserModelExample(1, "Aditya"));
        users.add(new UserModelExample(2, "Akshay"));
        users.add(new UserModelExample(3, "Shivam"));

        users.addLast(new UserModelExample(4, "XYZ"));
        users.addFirst(new UserModelExample(0, "ABC"));

        for (UserModelExample user : users) {
            System.out.println(user.id + " " + user.name);
        }

        System.out.println(users);
    }
}
