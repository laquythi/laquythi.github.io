package com.trungtamjava.exception;

public class ngoaiLe {
    public static void main(String[] args){
        int[] mang = {1,4,2};
        try {
            System.out.println(mang[8]);
        }catch (Exception e){
            System.out.println("try error " + e);
        };
        System.out.println("ket thuc");
    }
}
