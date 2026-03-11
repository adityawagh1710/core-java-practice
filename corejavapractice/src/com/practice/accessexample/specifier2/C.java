package com.practice.accessexample.specifier2;

import com.practice.accessexample.specifier1.A;

public class C {
    public static void main (String args[]) {
        A obj = new A();
        obj.msg();

        D obj2 = new D();
        obj2.display();
    }
}