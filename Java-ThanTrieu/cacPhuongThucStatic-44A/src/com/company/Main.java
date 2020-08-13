package com.company;

import static com.company.Main.doOtherThing;

public class Main {
    public static String something = "hello world";
    public static void main(String[] args) {
	// write your code here
        System.out.println(something);
//        doSomeThing(4);
        doOtherThing(5);
    }

    public void doSomeThing(int n){
        System.out.println("n = " + n);
    }
    public static void doOtherThing(int n){
        System.out.println("n = " + n);
    }
}
