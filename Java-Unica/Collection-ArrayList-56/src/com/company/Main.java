package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList ds1 = new ArrayList();
        ds1.add("thi la quy");
        ds1.add(5.5);

//        System.out.println("danh sach ds1 la :");
//        for (int i = 0; i < ds1.size(); i++) {
//            System.out.print(ds1.get(i) + " ");
//        }
//        System.out.println("\nphan tu thu 2 trong mang ds1 la :");
//        System.out.println(ds1.get(1));

        ArrayList<String> ds2 = new ArrayList<>();
        ArrayList<Integer> ds3 = new ArrayList<>();

        ArrayList<String> ds5 = new ArrayList<>();
        ds5.add("thi la quy");
        ds5.add("dong son");
        ds5.add("dong hung");
        ds5.add("thai binh");

//        for (int i = 0; i < ds5.size(); i++) {
//            System.out.print(ds5.get(i) + " ");
//        }

        ds5.set(0,"la quy thi");

        System.out.println("\ndanh sach sau khi chen them phan tu : ");
        ds5.add(2,"dong quan");
        for (int i = 0; i < ds5.size(); i++) {
            System.out.print(ds5.get(i) + " "); // la quy thi dong son dong quan dong hung thai binh
        }

        System.out.print("\ndanh sach sau khi xoa bot phan tu : ");
        ds5.remove(1);
        for (int i = 0; i < ds5.size(); i++) {
            System.out.print("\n" + ds5.get(i) + " ");
        }

        System.out.println("\ndanh sach sau khi sua phan tu : ");
        ds5.set(0,"thi la quy");
        for (int i = 0; i < ds5.size(); i++) {
            System.out.print(ds5.get(i) + " ");
        }
    }
}
