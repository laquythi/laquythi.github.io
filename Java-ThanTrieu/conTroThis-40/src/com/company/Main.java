package com.company;

import com.company.module.A;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new A();
        A a1 = new A();
        A a2 = a1;
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
