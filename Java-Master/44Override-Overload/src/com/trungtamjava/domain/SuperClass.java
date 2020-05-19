package com.trungtamjava.domain;

public class SuperClass {
    public int tong2So(int a,int b){
        return a + b;
    }

    // overload method,ten method giong nhau,doi so truyen vao khac nhau
    public long tong2So(int a,long b){
        return a + b;
    }

    public float tong2So(float a,float b){
        return a + b;
    }

    public static void main(String[] args) {
        // call overload method
        SuperClass sub = new SuperClass();
        System.out.println(sub.tong2So(6,7));
        System.out.println(sub.tong2So(5,4.2F));
    }
}
