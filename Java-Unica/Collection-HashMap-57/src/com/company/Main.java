package com.company;

import java.util.Collection;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// collection hashMap
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"la quy thi");
        map.put(2,"nhung lax");
        map.put(3,"hong anh la");
        map.put(4,"phong la");

        // lay ten
        Collection<String> dsTen = map.values();
        for (String ten:dsTen) {
            System.out.print(ten + " ");
        }

        System.out.println();
        // lay key
        Collection<Integer> dsKey = map.keySet();
        for (Integer key: dsKey) {
            System.out.print(key + " "); // 1 2 3 4
        }

        System.out.println();
        // lay ten cua tung key
        String ten = map.get(4);
        System.out.print(ten); // phong la

        // them phan tu
        System.out.println();
        map.put(5,"trang la");
        System.out.println("danh sach sau khi them 1 phan tu : ");
        dsTen = map.values();
        for (String ten1:dsTen) {
            System.out.print(ten1 + " ");
        }

        // sua phan tu
        System.out.println();
        map.put(2,"la thi nhung");
        System.out.println("danh sach sau khi sua 1 phan tu : ");
        dsTen = map.values();
        for (String ten2:dsTen) {
            System.out.print(ten2 + " ");
        }

        // xoa phan tu
        map.remove(2);
        System.out.println("\ndanh sach sau khi xoa 1 phan tu : ");
        dsTen = map.values();
        for (String ten2:dsTen) {
            System.out.print(ten2 + " ");
        }

    }
}
