package com.practice.collections;

import java.util.ArrayList;

public class UserModelArrayListExample {

    public ArrayList<UserModelExample> getUserModel() {
        ArrayList<UserModelExample> users = new ArrayList<>();

        users.add(new UserModelExample(1, "Aditya"));
        users.add(new UserModelExample(2, "Akshay"));
        users.add(new UserModelExample(3, "Shivam"));

        return users;
    }

    public static void main(String[] args) {
        UserModelArrayListExample UserModels = new UserModelArrayListExample();

        ArrayList<UserModelExample> users = UserModels.getUserModel();

        users.addLast(new UserModelExample(4, "XYZ"));

        users.addFirst(new UserModelExample(0, "ABC"));

        for (UserModelExample user : users) {
            System.out.println(user.getId() + " " + user.getName() + " ");
        }

        System.out.println(users.getClass()) ;
        System.out.println(users);
    }
}
