package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// bai tap mang
        // bai 1 : nhap vao 1 mang M gom cac so ngau nhien ko trung nhau
//        bai1();

        // bai 2 : viet ct cho ng dung nhap vao 1 day cac so theo thu tu tang dan,neu nhap sai thi yeu cau nhap lai
        // in ra man hinh day so sau khi nhap xong
//        bai2();

        // bai 3 : viet ct nhap vao 1 day n so thuc,M[0] --> M[n-1],sap xep theo thu tu giam dan. in ra man hinh
//        bai3();

        // bai 4 : viet ct nhap vao 1 mang cac so tu nhien,yeu cau xuat ra man hinh :
            // dong 1 : gom cac so le ,tong cong co bao nhieu so le
            // dong 2 : gom cac so chan,tong cong co bao nhieu so chan
            // dong 3 : gom cac so nguyen to
            // dong 4 : gom cac so ko phai so nguyen to

        bai4();
    }

//    public static void bai1(){
//        Scanner sc = new Scanner(System.in);
//        int[] M;
//        System.out.print("nhap so phan tu cua mang M : ");
//        int n = sc.nextInt();
//        M = new int[n];
//        int i = 0;
//        do {
//            int flag = 0;
//            System.out.print("nhap phan tu thu " + i + " : ");
//            M[i] = sc.nextInt();
//            for (int j = i - 1; j >= 0 ; j--) {
//                if(M[i] == M[j]){
//                    // neu ptu dung sau bang ptu dung truoc thi flag = 1,sau do thoat vong lap for
//                    System.out.println("phan tu da ton tai,moi ban nhap lai : ");
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 1){
//                // neu flag = 1 thi quay lai thuc hien tiep than vong lap do - while
//                continue;
//            }else{
//                // neu nguoc lai thi i++,sau do quay lai thuc hien tiep than vong lap do - while
//                i++;
//            }
//        }while (i < n);
//
//        System.out.println("mang sau khi da nhap hoan thanh la : ");
//        for (int j = 0; j < M.length; j++) {
//            System.out.print(M[j] + " ");
//        }
//    }

//    bai 2 lam tuong tu nhu bai 1,thay dieu kien trong vong lap for thanh M[j] > M[i]
//    public static void bai2(){
//        Scanner sc = new Scanner(System.in);
//        int[] M;
//        System.out.print("nhap so phan tu cua mang M : ");
//        int n = sc.nextInt();
//        M = new int[n];
//        int i = 0;
//        do {
//            int flag = 0;
//            System.out.print("nhap phan tu thu " + i + " : ");
//            M[i] = sc.nextInt();
//            for (int j = i - 1; j >= 0 ; j--) {
//                if(M[i] < M[j]){
//                    // neu ptu dung sau > ptu dung truoc thi flag = 1,sau do thoat vong lap for
//                    System.out.println("phan tu sau > phan tu truoc,ban vui long nhap lai : ");
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 1){
//                // neu flag = 1 thi quay lai thuc hien tiep than vong lap do - while
//                continue;
//            }else{
//                // neu nguoc lai thi i++,sau do quay lai thuc hien tiep than vong lap do - while
//                i++;
//            }
//        }while (i < n);
//
//        System.out.println("mang sau khi da nhap hoan thanh la : ");
//        for (int j = 0; j < M.length; j++) {
//            System.out.print(M[j] + " ");
//        }
//
//    }

//    public static void bai3(){
//        Scanner sc = new Scanner(System.in);
//        double[] M;

//        System.out.print("nhap so phan tu cua mang M : ");
//        int n = sc.nextInt();
//        M = new double[n];

//        Random rd = new Random();
//        for (int i = 0; i < M.length; i++) {
//            M[i] = rd.nextDouble();
//        }
//
//        System.out.println("mang sau khi xuat ngau nhien la : ");
//        for (int i = 0; i < M.length; i++) {
//            System.out.print(M[i] + " ");
//        }
//
//        for (int i = 0; i < M.length; i++) {
//            for (int j = i + 1; j < M.length; j++) {
//                if(M[j] > M[i]){
//                    double tam = M[i];
//                    M[i] = M[j];
//                    M[j] = tam;
//                }
//            }
//        }
//
//        System.out.println("\nmang sau khi sap xep giam dan la : ");
//        for (int i = 0; i < M.length; i++) {
//            System.out.print(M[i] + " ");
//        }
//    }

    public static void bai4(){
        int[] M;
        System.out.print("nhap so phan tu cho mang : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        M = new int[n];

        Random rd = new Random();
        for (int i = 0; i < M.length; i++) {
            M[i] = rd.nextInt(100);
        }

        System.out.println("mang sau khi nhap ngau nhien la :"  );
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
//
//        // xuat ra cac so chan,dem cac so chan
        System.out.println("\ncac so chan trong mang : ");
        int demChan = 0;
        for (int i = 0; i < M.length; i++) {
            if(M[i] % 2 == 0){
                demChan++;
                System.out.print(M[i] + " ");
            }
        }
        System.out.print("co tong cong " + demChan + " so chan trong mang");
//
//        // xuat ra cac so le,dem cac so le
        System.out.println("\ncac so le trong mang : ");
        int demLe = 0;
        for (int i = 0; i < M.length; i++) {
            if(M[i] % 2 != 0){
                demLe++;
                System.out.print(M[i] + " ");
            }
        }
        System.out.print("co tong cong " + demLe + " so le trong mang");
//
//        // xuat ra cac so nguyen to,dem cac so nguyen to
        int demSoNt = 0;
        System.out.println("\ncac so nguyen to trong mang la ");
        for (int i = 0; i < M.length; i++) {
            int dem = 0;
            for (int j = 1; j <= M[i]; j++) {
                if(M[i] % j == 0){
                    dem++;
                }
            }
            if(dem == 2){
                demSoNt++;
                System.out.print(M[i] + "\t");
            }
        }
        System.out.println("\nco tat ca " + demSoNt + " so nguyen to trong mang");
    }

}
