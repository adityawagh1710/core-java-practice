package com.practice.typecasting.objects;

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Employee emp = new Manager();
        emp.work();

        // Down casting
        Manager mgr = (Manager) emp;
        mgr.approveLeave();
    }
}
