package com.company;

public class Subclass extends hienThi{
    String name = "la quy thi";

    public void hienThi(){
        System.out.println("day la phuong thuc hienThi() cua lop con");
    }

    public void subclassMethod(){
        Subclass subclass = new Subclass();

        // goi hienThi() cua lop cha
        super.hienThi();

        // goi hienThi() cua lop con
        subclass.hienThi();

        System.out.println("gia tri bien name cua lop cha : " + super.name);
        System.out.println("gia tri bien name cua lop con : " + subclass.name);

        public static void main(String[] args){
            Subclass objSubclass = new Subclass();
            objSubclass.subclassMethod();
        }
    }
}