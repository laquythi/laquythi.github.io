package com.company;

public class TestOverriding{
    public static void main(String[] args){
        Superclass superclass = new Superclass();
        Superclass subclass = new Subclass();

        superclass.hienThi();
        subclass.hienThi();
    }
}