package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("vui long nhap vao gia tri :");

        String name = scan.next();
        System.out.println("gia tri nhap vao la " + name);

        System.out.println("nhap firstname va lastname");
        String firstName = scan.next();
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;
        System.out.println("full name is " +  fullName); // thi la ???
    }
}
