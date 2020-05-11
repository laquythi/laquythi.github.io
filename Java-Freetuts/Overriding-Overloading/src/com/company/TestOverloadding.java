package com.company;

public class TestOverloadding{
    public static void main(String[] args){
        PhepCongHaiSo test = new PhepCongHaiSo();
        System.out.println("Tong = " + test.add(7,9));
        System.out.println("Tong = " + test.add(7.5,9.2));
    }
}