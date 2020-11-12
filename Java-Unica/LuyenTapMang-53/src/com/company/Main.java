package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        /*
        1 nhap mang
        2 xuat mang
        3 tinh tong mang
        4 tim kiem phan tu xuat hien bao nhieu lan
        5 tim phan tu lon nhat,nho nhat
        6 xuat cac so nguyen to
        7 sap xep mang tang dan,giam dan
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang : ");
        int n = sc.nextInt();
        int[] M = new int[n];

        nhapMang(M);
        System.out.println("mang ban vua nhap la : ");
        xuatMang(M);

        // tinh tong cac phan tu trong mang
        System.out.print("\ntong cac phan tu co trong mang la : ");
        tinhTongPhanTu(M);

        // tim kiem phan tu xuat hien trong mang
        timKiemPhanTu(M);
        timMaxMin(M);

        // tim kiem so nguyen to trong mang
        System.out.print("cac so nguyen to co trong mang la : ");
        xuatSoNguyenTo(M);

        // sap xep mang tang dan
        sapXepTang(M);
        xuatMang(M);

//         sap xep mang giam dan
        sapXepGiam(M);
        xuatMang(M);

    }

    public static void nhapMang(int[] M){
        Random rd = new Random();
        for (int i = 0; i < M.length; i++) {
            M[i] = rd.nextInt(30);
        }
    }

    public static void xuatMang(int[] M){
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
    }

    public static void tinhTongPhanTu(int[] M){
        int tong = 0;
        for (int i = 0; i < M.length; i++) {
            tong = tong + M[i];
        }
        System.out.print(tong);
    }

    public static void timKiemPhanTu(int[] M){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nnhap phan tu ban muon tim : ");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if(M[i] == k){
                count++;
            }
        }
        if(count == 0){
            System.out.println("phan tu " + k + " ko xuat hien trong mang");
        }else{
            System.out.println("phan tu " + k + " xuat hien " + count + " lan trong mang");
        }
    }

    public static void timMaxMin(int[] M){
        Arrays.sort(M);
        System.out.println("phan tu lon nhat la " + M[M.length-1]);
        System.out.println("phan tu nho nhat la " + M[0]);
    }

    public static void xuatSoNguyenTo(int[] M){ // lam theo Unica
        for (int i = 0; i < M.length; i++) {
            int dem = 0;
            for (int j = 1; j <= M[i]; j++) {
                if(M[i] % j == 0){
                    dem++;
                }
            }
            if(dem == 2){
                System.out.print(M[i] + "\t");
            }
        }
    }

    public static void sapXepTang(int[] M){
        System.out.println("\nmang sau khi sap xep tang dan la : ");
        Arrays.sort(M);

    }

    public static void sapXepGiam(int[] M){
        System.out.println("\nmang sau khi sap xep giam dan la : ");
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if(M[i] < M[j]){ // o mang sap xep tang dan chi can thay dieu kien M[i] > M[j] la xong
                    int tam = M[i];
                    M[i] = M[j];
                    M[j] = tam;
                }
            }
        }
    }

}
