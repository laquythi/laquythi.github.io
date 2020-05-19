package com.trungtamjava.domain;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Person p = new Employee();
        Person p2 = new Person();

        emp.setName("tran thuy");
        emp.setSalary(800);

        p.setName("memories Phamm");

        emp.thongTin(); // class con
        p.thongTin(); // class con
        p2.thongTin(); // class cha
    }
}
