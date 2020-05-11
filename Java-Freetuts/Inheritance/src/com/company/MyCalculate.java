package com.company;

public class MyCalculate extends Calculate{
    public void phepNhan(int a,int b){
        c = a * b;
        System.out.println("tich 2 so = " + c);
    }

    public void phepLuyThua(int a,int b){
        c = (int)Math.pow(a,b);
        System.out.println("a^b = " + c);
    }

    public static void main(String[] args){
        int a = 7,b = 9;
        MyCalculate myCalculate = new MyCalculate();
        myCalculate.phepCong(a,b);
        myCalculate.phepNhan(a,b);
        myCalculate.phepLuyThua(a,b);
    }
}
