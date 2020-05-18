package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(tongHaiSo());
        System.out.println(hieuHaiSo(10,15));
        xinChao();
    }
    public static int tongHaiSo(){
        int a = 7;
        int  b = 9;
        int tong = a + b;
        return tong;
    }

    public static int hieuHaiSo(int x,int y){
        int hieu = x - y;
        return hieu;
    }

    public static void xinChao(){
        System.out.println("hello world");
    }
}
