package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        kq(i--); // prefix
        i=0;
        kq(--i); //postfix
    }
    public static void kq(int i){
        System.out.println(i);
    }
}
