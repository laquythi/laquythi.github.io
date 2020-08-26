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
        System.out.println("1.Them : ");
        System.out.println("2.Xuat danh sach : ");
        System.out.println("3.Sua : ");
        System.out.println("4.Xoa : ");
        System.out.println("5.Tim kiem : ");
        System.out.println("6.Sap xep : ");
        System.out.println("7.Thoat : ");
        System.out.println("moi ban chon Menu : ");
        int chon = new Scanner(System.in).nextInt();

        switch (chon){
            case 1:
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
//        System.out.println("array list sau khi sap xep tang dan la : ");
        Collections.sort(dsData);
//        xuatDanhSach();

        System.out.println("array lis sau khi sap xep giam dan la : ");
        for (int i = dsData.size()-1;i >=0;i--) {
            System.out.print(dsData.get(i) + " ");
        }
        System.out.println();
    }

    public static void timKiem() {
        System.out.println("nhap vao so ban tim kiem : ");
        int soCanTim = new Scanner(System.in).nextInt();
        // tim kiem cach 1
//        int dem = 0;
//        for (int i = 0; i < dsData.size(); i++) {
//            if(soCanTim == dsData.get(i)){
//                dem++;
//            }
//        }
//        if (dem > 0){
//            System.out.println("so " + soCanTim + " co xuat hien trong array list");
//        }else{
//            System.out.println("so " + soCanTim + " ko xuat hien trong array list");
//        }

        // tim kiem cach 2,dung contains de kiem tra soCanTim trong list dsData.
        if(dsData.contains(soCanTim)){
            System.out.println(soCanTim + " co xuat hien trong array list");
        }else{
            System.out.println(soCanTim + " ko xuat hien trong array list");
        }
    }

    public static void xoaDanhSach() {
        System.out.println("nhap vi tri ban muon xoa phan tu : ");
        int viTriXoa = new Scanner(System.in).nextInt();
        dsData.remove(viTriXoa);
        System.out.println("array list sau khi xoa phan tu la : ");
        xuatDanhSach();
    }

    public static void suaDanhSach() {
        System.out.println("nhap vi tri ban muon sua : ");
        int viTri = new Scanner(System.in).nextInt();
        System.out.println("nhap gia tri ban muon sua : ");
        int vaLue = new Scanner(System.in).nextInt();
        dsData.set(viTri,vaLue);
        System.out.println("array list sau khi sua la : ");
        xuatDanhSach();
    }

    public static void xuatDanhSach() {
        for (int i = 0; i < dsData.size(); i++) {
            System.out.print(dsData.get(i) + " ");
        }
        System.out.println();
    }

    public static void them() {
        System.out.println("moi ban nhap gia tri muon them : ");
        int value = new Scanner(System.in).nextInt();
        dsData.add(value);
    }
}
