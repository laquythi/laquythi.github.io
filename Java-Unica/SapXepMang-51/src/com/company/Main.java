package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sap xep mang
        Scanner sc = new Scanner(System.in);
        int[] M;
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        M = new int[n];
        nhapMang(M);
        System.out.println("mang sau khi nhap ngau nhien la : ");
        xuatMang(M);
        System.out.println();
        
        sapXepMang(M);
        System.out.println("mang sau khi sap xep la : ");
        xuatMang(M);
    }

    public static void nhapMang(int[] M){
        Random rd = new Random();
        for (int i = 0; i < M.length; i++) {
            M[i] = rd.nextInt(10);
        }
    }

    public static void xuatMang(int[] M){
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
    }

    public static void sapXepMang(int[] M){
        Arrays.sort(M);
    }
}
