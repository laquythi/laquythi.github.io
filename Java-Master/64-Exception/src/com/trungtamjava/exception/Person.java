package com.trungtamjava.exception;

public class Person {
    public static void print() throws ArrayIndexOutOfBoundsException{
        int[] mang = {1,5};
        System.out.println(mang[2]);
    }

    public static void main(String[] args) {
        try {
            print();
        }catch (Exception e){
            System.out.println("error " + e);
        }
    }
}
