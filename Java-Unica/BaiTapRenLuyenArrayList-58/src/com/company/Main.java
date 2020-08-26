package com.company;

import java.util.*;

public class Main {
    static ArrayList<Integer> dsData = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println();
        System.out.println("1 Them ");
        System.out.println("2 Xuat danh sach ");
        System.out.println("3 Sua danh sach ");
        System.out.println("4 Xoa ");
        System.out.println("5 Tim kiem ");
        System.out.println("6 Sap xep ");
        System.out.println("7 Thoat ");
        System.out.println("moi ban chon menu : ");
        int chon = new Scanner(System.in).nextInt();
        switch (chon){
            case 1 :
                them();
                break;
            case 2 :
                xuatDanhSach();
                break;
            case 3 :
                suaDanhSach();
                break;
            case 4 :
                xoaDanhSach();
                break;
            case 5 :
                timKiem();
                break;
            case 6 :
                sapXep();
                break;
            case 7 :
                System.err.println("cam on ban");
                System.exit(0);
                break;

        }
    }

    public static void sapXep() {
        System.out.println("\narray list sau khi sap xep tang dan la : ");
        Collections.sort(dsData);
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i) + " ");
        }

        System.out.println("array list sau khi sap xep giam dan la : ");
        for (int i = dsData.size() - 1; i >= 0 ; i--) {
            System.out.print(dsData.get(i) + " ");
        }
    }

    public static void timKiem() {
        System.out.println("moi ban nhap vao gia tri can tim : ");
        int soCanTim = new Scanner(System.in).nextInt();

        // tim kiem cach 1,dung vong lap de tim phan tu nhu binh thuong
//        int count = 0;
//        for (int i = 0; i < dsData.size(); i++) {
//            if (soCanTim == dsData.get(i)){
//                count++;
//            }
//        }
//        if (count > 0) {
//            System.out.print("so " + soCanTim + " xuat hien " + count + " lan trong array list");
//        }else{
//            System.out.print("so " + soCanTim + " ko xuat hien trong array list");
//        }

        // tim kiem cach 2,dung contains de kiem tra phan tu trong array list
        if(dsData.contains(soCanTim)){
            System.out.print(soCanTim + " co xuat hien trong array list");
        }else{
            System.out.print(soCanTim + " ko xuat hien trong array list");
        }
    }

    public static void xoaDanhSach() {
        System.out.println("moi ban nhap vi tri can xoa : ");
        int viTriXoa = new Scanner(System.in).nextInt();
        dsData.remove(viTriXoa);

        System.out.println("danh sach sau khi xoa bot phan tu la : ");
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i) + " ");
        }
    }

    public static void suaDanhSach() {
        System.out.println("moi ban nhap vi tri can sua : ");
        int viTri = new Scanner(System.in).nextInt();
        System.out.println("moi ban nhap gia tri can sua : ");
        int value = new Scanner(System.in).nextInt();
        dsData.set(viTri,value);

        System.out.println("danh sach sau khi sua lai la : ");
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i) + " ");
        }
        System.out.println();
    }

    public static void xuatDanhSach() {
        System.out.println("danh sach cac gia tri dc them la : ");
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i) + " ");
        }
        System.out.println();
    }

    public static void them() {
        System.out.println("moi ban nhap gia tri can them : ");
        int value = new Scanner(System.in).nextInt();
        dsData.add(value);
    }
}
