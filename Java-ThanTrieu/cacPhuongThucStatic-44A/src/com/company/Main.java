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
        // phuong thuc doSomeThing ko static,nen ko the dung chung trong ham main(ko the goi pt doSomeThing)
        System.out.println("n = " + n);
    }
    public static void doOtherThing(int n){
        // pt doOtherThing co bien static nen co the goi dc trong ham main.
        System.out.println("n = " + n);
    }
}
