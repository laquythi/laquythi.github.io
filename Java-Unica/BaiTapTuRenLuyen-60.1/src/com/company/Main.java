package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<String> dsSinhVien= new ArrayList<>();
    public static void main(String[] args) {
	// bai tap ren luyen Array List
        // viet chuong trinh quan ly ten,ma sinh vien
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println("-----------------");
        System.out.println("danh sach menu ");
        System.out.println("1 : them sinh vien ");
        System.out.println("2 : xuat danh sach sinh vien ");
        System.out.println("3 : sua danh sach ");
        System.out.println("4 : xoa ");
        System.out.println("5 : tim kiem ");
        System.out.println("6 : sap xep ");
        System.out.println("7 : in so luong sinh vien");
        System.out.println("moi ban chon phuong thuc : ");
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
                xoaDanhSach();
                break;
            case 5 :
                timKiem();
                break;
            case 6 :
                sapXep();
                break;
            case 7 :
                inSoLuong();
                break;
            default:
                System.err.println("cam on ban.");
                System.exit(0);
                break;
        }
    }

    public static void inSoLuong() {
        System.out.println("so luong sinh vien hien tai la " + dsSinhVien.size());
    }

    public static void sapXep() {
        Collections.sort(dsSinhVien);
        System.out.println("danh sach sinh vien sau khi sap xep la : ");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println(dsSinhVien.get(i));
        }
    }

    public static void timKiem() {
        System.out.println("moi ban nhap ten can tim kiem :");
        String ten = new Scanner(System.in).nextLine();
        
        if(dsSinhVien.contains(ten) == true){
            System.out.println("ten ban nhap co ton tai trong danh sach sinh vien : ");
        }else{
            System.out.println("ten ban nhap ko ton tai trong ds sinh vien.");
        }
    }

    public static void xoaDanhSach() {
        System.out.println("moi ban nhap vi tri can xoa : ");
        int viTri = new Scanner(System.in).nextInt();

        dsSinhVien.remove(viTri);

        System.out.println("danh sach sau khi xoa bot phan tu la : ");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println(dsSinhVien.get(i));
        }
    }

    public static void suaDanhSach() {
        System.out.println("moi ban nhap vi tri can sua : ");
        int viTri = new Scanner(System.in).nextInt();

        System.out.println("moi ban nhap gia tri moi : ");
        String value = new Scanner(System.in).nextLine();

        dsSinhVien.set(viTri,value);

        System.out.println("danh sach sinh vien sau khi sua la  : ");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println(dsSinhVien.get(i));
        }
    }

    public static void xuatDanhSach() {
        System.out.println("danh sach sinh vien hien tai la : ");
        for (int i = 0; i < dsSinhVien.size(); i++) {
            System.out.println(dsSinhVien.get(i));
        }
    }

    public static void themSv() {
        System.out.println("moi ban nhap ten sinh vien can them : ");
        String ten = new Scanner(System.in).nextLine();
        dsSinhVien.add(ten);
    }
}
