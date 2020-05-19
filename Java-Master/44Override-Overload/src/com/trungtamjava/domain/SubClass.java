package com.trungtamjava.domain;

public class SubClass extends SuperClass{
    @Override
    //Override hay con goi la ghi de method
    public float tong2So(float a, float b) {
        return super.tong2So(a, b);
    }
    @Override
    public int tong2So(int a, int b) {
        return a + b + 79;
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        System.out.println(sub.tong2So(2,3));
    }
}
