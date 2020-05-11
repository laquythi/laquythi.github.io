package com.company;

public class Subclass extends Superclass {
    int number = 20;

    public void hienThi(){
        System.out.println("day la hienThi() cua lop con");
    }

    public void subclassMethod(){
        Subclass subclass = new Subclass();

        super.hienThi();

        subclass.hienThi();

        System.out.println("gia tri bien number cua lop cha = " + super.number);

        System.out.println("gia tri bien number cua lop con = " + subclass.number);
    }

    public static void main(String[] args){

    }
}
