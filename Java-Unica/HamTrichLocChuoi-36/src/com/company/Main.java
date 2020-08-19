package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fullName = "la quy thi dong hung thai binh";
        String name = fullName.substring(0,10);
        System.out.println(name);
        String firstName = fullName.substring(7,10);
        System.out.println(firstName);

        String address = fullName.substring(11);
        System.out.println(address);
    }
}
