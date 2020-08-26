package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static HashMap<Integer,String > map = new HashMap<>();
    public static void main(String[] args) {
	// write your code here
        while (true){
            menu();
        }
    }

    public static void menu(){
        System.out.println("danh sach menu : ");
        System.out.println("1 : them ");
        System.out.println("2 : xuat danh sach");
        System.out.println("3 : sua danh sach");
        System.out.println("4 : xoa danh sach");
        System.out.println("5 : tim kiem");

        System.out.println("moi ban chon menu : ");
        int chon = new Scanner(System.in).nextInt();

        switch (chon){
            case 1 :
                themDanhSach();
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
                timKiemDanhSach();
                break;
            case 6 :
                System.err.println("cam on ban");
                System.exit(0);
                break;
        }
    }

    public static void timKiemDanhSach() {
        // tim kiem theo ma cuon sach
//        System.out.println("moi ban nhap ma cuon sach muon tim : ");
//        int ma = new Scanner(System.in).nextInt();
//        if(map.containsKey(ma) == false){
//            System.out.println("ko ton tai cuon sach co ma nhu tren");
//        }else{
//            System.out.println("cuon sach ma ban muon tim la : " + map.get(ma));
//        }

        // tim kiem theo 1 doan ky tu trong ten sach,vi du "nhung ke xuat chung" => tim tu "xuat chung"
        System.out.println("nhap ten cuon sach ban muon tim : ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("thong tin ve cuon sach ban muon tim la : ");
        int count = 0;
        for(Map.Entry<Integer,String>item: map.entrySet()){
            if(item.getValue().contains(ten)){
                System.out.println(item.getKey()+"-"+item.getValue());
            }else{
                count++;
            }
        }
        if (count > 0){
            System.out.println("ko co cuon sach nao co ky tu ban vua nhap.");
        }
    }

    public static void xoaDanhSach() {
        System.out.println("moi ban nhap ma sach muon xoa : ");
        int ma = new Scanner(System.in).nextInt();
        if(map.containsKey(ma) == false){
            System.out.println("ma " + ma + " chua ton tai trong danh sach");
        }else{
            map.remove(ma);
        }
        System.out.println("danh sach sach sau khi xoa bot la : ");
        xuatDanhSach();
    }

    public static void suaDanhSach() {
        System.out.println("moi ban nhap ma sach muon sua : ");
        int ma = new Scanner(System.in).nextInt();
        if(map.containsKey(ma) == false){
            System.out.println("ma " + ma + " chua ton tai.");
        }else{
            System.out.println("nhap ten sach moi : ");
            String ten = new Scanner(System.in).nextLine();
            map.put(ma,ten);
        }
        System.out.println("danh sach sach sau khi sua la : ");
        xuatDanhSach();
    }

    public static void xuatDanhSach() {
        System.out.println("ma\tten sach : ");
        for(Map.Entry<Integer,String> item : map.entrySet()){
            System.out.println(item.getKey() + "\t" + item.getValue());
        }
    }

    public static void themDanhSach() {
        System.out.println("nhap ma sach : ");
        int ma = new Scanner(System.in).nextInt();
        System.out.println("nhap ten sach : ");
        String ten = new Scanner(System.in).nextLine();
        if(map.containsKey(ma) == false){
            map.put(ma,ten);
        }
    }
}
