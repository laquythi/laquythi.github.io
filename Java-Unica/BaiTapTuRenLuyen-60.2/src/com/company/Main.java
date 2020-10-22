package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static HashMap<Integer,String> dsSinhVien = new HashMap<>();
    public static void main(String[] args) {
	// bai tap tu ren luyen Hash Map
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println("---------------");
        System.out.println("danh sach menu : ");
        System.out.println("1 them ");
        System.out.println("2 xuat danh sach ");
        System.out.println("3 sua danh sach ");
        System.out.println("4 xoa ");
        System.out.println("5 tim ");
        System.out.println("6 xuat ma sinh vien");
        System.out.println("7 xuat ten sinh vien");

        System.out.println("moi ban nhap phuong thuc : ");
        int chon = new Scanner(System.in).nextInt();

        switch (chon){
            case 1 :
                themSv();
                break;
            case 2 :
                xuatDanhSach();
                break;
            case 3 :
                suaDanhSach();
                break;
            case 4 :
                xoa();
                break;
            case 5 :
                tim();
                break;
            case 6 :
                xuatMaSv();
                break;
            case 7 :
                xuatTenSv();
                break;
            default:
                System.err.println("cam on ban.");
                System.exit(0);
                break;
        }
    }

    public static void xuatTenSv() {
        System.out.println("danh sach ten sinh vien la : ");
        for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
                System.out.println(item.getValue() + "\t");
            }
        }

    public static void xuatMaSv() {
        System.out.println("danh sach ma sinh vien la : ");
        for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
                System.out.print(item.getKey() + "\t");
            }
        }

    public static void tim() {
        // 1 tim kiem theo ma sinh vien
//        System.out.println("moi ban nhap ma sinh vien :");
//        int ma = new Scanner(System.in).nextInt();

//        if(dsSinhVien.containsKey(ma) == false){
//            System.out.println("ko ton tai sinh vien co ma " + ma + " trong danh sach");
//        }else{
//            System.out.println(dsSinhVien.get(ma));
//        }

        // 2 dung phuong thuc contains de tim ky tu nam trong ten sinh vien
//        System.out.println("moi ban nhap ten sinh vien can tim :");
//        String name = new Scanner(System.in).nextLine();

//        System.out.println("thong tin ve sinh vien ban dang tim la :");
//        int count = 0;

//        for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
//            if (item.getValue().contains(name) == true){
//                System.out.println(item.getKey() + "\t" + item.getValue());
//                count++;
//            }
//        }
//        if(count == 0){
//            System.out.println("ko ton tai sinh vien co ma nhu tren.");
//        }

        // 3 tim sinh vien co ten gom chu "an"
        String name = "an";
        System.out.println("thong tin ve sinh vien ban dang tim la : ");
        int count = 0;
        for(Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
            if(item.getValue().contains(name) == true){
                System.out.println(item.getKey() + "\t" + item.getValue());
                count++;
            }
        }
        if(count == 0){
            System.err.println("ko ton tai sinh vien co ten nhu tren.");
        }
    }

    public static void xoa() {
        System.out.println("nhap ma sinh vien can xoa : ");
        int ma = new Scanner(System.in).nextInt();

        if(dsSinhVien.containsKey(ma) == false){
            System.out.println("chua co sinh vien nao co ma so nhu tren.");
        }else{
            dsSinhVien.remove(ma);
            System.out.println("danh sach sau khi xoa bot phan tu la :");
            for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
                System.out.println(item.getKey() + "\t" + item.getValue());
            }
        }
    }

    public static void suaDanhSach() {
        System.out.println("moi ban nhap ma sinh vien can sua :");
        int ma = new Scanner(System.in).nextInt();

        if(dsSinhVien.containsKey(ma) == false){
            System.out.println("chua co sinh vien nao co ma so nhu tren.");
        }else{
            System.out.println("nhap ten moi : ");
            String ten = new Scanner(System.in).nextLine();
            dsSinhVien.put(ma,ten);
            System.out.println("danh sach sau khi sua la : ");
            for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
                System.out.println(item.getKey() + "\t" + item.getValue());
            }
        }
    }

    public static void xuatDanhSach() {
        System.out.println("danh sach sinh vien hien tai la : ");
        for (Map.Entry<Integer,String> item : dsSinhVien.entrySet()){
            System.out.println(item.getKey() + "\t" + item.getValue());
        }
    }

    public static void themSv() {
        System.out.println("moi ban nhap ma sinh vien ");
        int ma = new Scanner(System.in).nextInt();

        if(dsSinhVien.containsKey(ma) == true){
            System.out.println("ma sinh vien da ton tai trong danh sach");
        }else{
            System.out.println("moi ban nhap ten sinh vien : ");
            String ten = new Scanner(System.in).nextLine();
            dsSinhVien.put(ma,ten);
        }
    }
}
