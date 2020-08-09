package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int  a = 100;
//        int b = 28;
//
//        int result = a/b; // ket qua result = 2;
//        float result2 = a/(b*1.0f);
//
//        System.out.println(result);
//        System.out.println(result2);
//
//        a += 20;
//        System.out.println(a);

        // prefix & postfix
        // prefix
//        int a = 5;
//        int b = a--;
//        System.out.println(b); // ket qua b = 5;
//        System.out.println(a); // ket qua a = 4;

        // postfix
//        int a = 5;
//        int b = --a;
//        System.out.println(b); // ket qua b = 4;
//        System.out.println(a); // ket qua a = 4;

        // logic operator
//        int a = 6;
//        int b = 5;
//        int c = 3;
//        System.out.println((a < b) || (a < c));

        int a = 5;
        int b = 7;
        String res = "";
        res = (a < b) ? ("a < b") : ("a > b");
        System.out.println(res);
    }
}
