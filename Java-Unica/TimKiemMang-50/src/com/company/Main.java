package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] M;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang M ");
        int n = sc.nextInt();
        M = new int[n];
        System.out.println("nhap gia tri cho cac phan tu trong mang M");
        nhapMang(M);
        System.out.println("gia tri cua mang M la ");
        xuatMang(M);
        System.out.println("------------");
        System.out.println("moi ban nhap vao so muon tim : ");
        int k = sc.nextInt();
        timSoLanXuatHien(M,k);
        System.out.println("vi tri xuat hien " + k + " trong mang la : ");
        timViTriXuatHien(M,k);
    }

    public static void nhapMang(int[] M){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            M[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] M){
        System.out.println("-----------");
        System.out.println("mang ban vua nhap la : ");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
    }

    public static void timKiemMang(int[] M,int k){
        boolean timThay = false;
        for (int i = 0; i < M.length; i++) {
            if(M[i] == k){
                timThay = true;
                break;
            }
        }
        if(timThay == true){
            System.out.println("tim thay " + k + " trong mang M");
        }else{
            System.out.println("ko tim thay " + k + " trong mang M");
        }
    }

    public static void timSoLanXuatHien(int[] M,int k){
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if(M[i] == k){
                count++;
            }
        }
        System.out.println("phan tu " + k + " xuat hien " + count + " lan trong mang.");
    }

    public static void timViTriXuatHien(int[] M,int k){
        for (int i = 0; i < M.length; i++) {
            if(M[i] == k){
                System.out.print(i + " ");
            }
        }
    }
}
