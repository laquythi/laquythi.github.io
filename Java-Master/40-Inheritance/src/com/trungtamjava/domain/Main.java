package com.trungtamjava.domain;

public class Main {
    public static void main(String[] args){
        // Inheritance
        NhanVien nhanVien = new NhanVien();
        nhanVien.name = "la quy thi";
        nhanVien.address = "thai binh";
        nhanVien.luong = 500;

        System.out.println(nhanVien.name + " " + nhanVien.address + " " + nhanVien.luong);

        // method
        String herName = nhanVien.setName("tran thuy");
        String herAdd = nhanVien.setAddress("thanh xuan");
        System.out.println(herName + " " + herAdd);

        CongNhan congNhan = new CongNhan();
        String hisName = congNhan.setName("pham van thang");
        String hisAdd = congNhan.setAddress("xuan hoa thai binh");
        System.out.printf(hisName + " " + hisAdd);
    }
}
