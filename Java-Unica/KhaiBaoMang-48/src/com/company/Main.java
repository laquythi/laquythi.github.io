package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// khai bao mang
//        int[] arr = {43, 6, 2, 5, 1};
//        double[] d = new double[5];
//        d = new double[]{1.4, 5.3, 1.5, 4.2, 3.3};
//        String[] arrName = {"thi","anh","phong","nhung"};
//        for (int i = 0; i < arrName.length; i++) {
//            System.out.print(arrName[i] + " ");
//        }

        // 49 : truy xuat va thao tac tren mang
        Scanner sc = new Scanner(System.in);
//        int[] M;
//        System.out.println("nhap so phan tu cho mang M ");
//        int n = sc.nextInt();
//        M = new int[n];
//        for (int i = 0; i < M.length; i++) {
//            System.out.print("nhap phan tu thu " + i + " ");
//            M[i] = sc.nextInt();
//        }
//        for (int i = 0; i < M.length; i++) {
//            System.out.println("phan tu thu " + i + " trong mang name la " + M[i]);
//        }

//        String[] name;
//        System.out.println("nhap so phan tu cho mang name ");
//        int n = sc.nextInt();
//        name = new String[n];
//        for (int i = 0; i < name.length; i++) {
//            System.out.print("nhap phan tu thu " + i + " ");
//            name[i] = sc.next();
//        }
//        for (int i = 0; i < name.length; i++) {
//            System.out.print(name[i] + "\t");
//        }
//        System.out.println("----------");
//        // doi gia tri cua 1 hoac nhieu phan tu :
//        name[1] = "ngan";
//        for (int i = 0; i < name.length; i++) {
//            System.out.print(name[i] + "\t");
//        }

        int[] age;
        System.out.println("nhap so phan tu cho mang age : ");
        int n = sc.nextInt();
        age = new int[n];
        for (int i = 0; i < age.length; i++) {
            System.out.print("nhap do tuoi cua cac thanh vien " );
            age[i] = sc.nextInt();
        };
        for (int j : age) {
            System.out.print("tuoi cua cac thanh vien la " + j + "\n");
        }
    }
}
