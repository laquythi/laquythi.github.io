package com.company;

public class HinhVuong {
    public static void chuVi(float chieuDai){
        float chuVi = 4*chieuDai;
        System.out.println("chu vi hinh vuong = " + chuVi + " cm");
    }

    public static void dienTich(float chieuDai){
        float dienTich = (float) Math.pow(chieuDai,2);
        System.out.println("dien tich hinh vuong = " + dienTich + " cm2");
    }
}
