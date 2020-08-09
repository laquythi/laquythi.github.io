package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("nhap vao 1 dong ky tu:");
//        String line = scanner.nextLine();
//
//        System.out.println("nhap vao 1 chuoi ky tu: ");
//        String name = scanner.next();
//
//        System.out.println("nhap vao 1 so nguyen: ");
//        int a = scanner.nextInt();
//
//        System.out.println("nhap vao 1 so float:");
//        float b = scanner.nextFloat();
//
//        System.out.print(line + name + "\t" + a + "\t" + b + "\n");

        // dinh dang du lieu xuat ra man hinh
        int a = 10;
        int b = 3;
        double res = 1.0*a/b;
//        System.out.println(res);
        System.out.printf("ket qua = %-10.2f",res);
    }
}
