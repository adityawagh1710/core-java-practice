package com.practice.access.example.specifier2;

import com.practice.access.example.specifier1.A;

public class C {
    public static void main (String args[]) {
        A obj = new A();
        obj.msg();

        D obj2 = new D();
        obj2.display();
    }
}