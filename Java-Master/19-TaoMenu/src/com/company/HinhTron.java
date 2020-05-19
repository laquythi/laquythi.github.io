package com.company;

public class HinhTron {
    public static void ChuVi(float banKinh){
        float ChuVi = (float) (2*banKinh*Math.PI);
        System.out.println("Chu vi hinh tron = " + ChuVi + " cm");
    }

    public static void DienTich(float banKinh){
        float dienTich = (float) (Math.PI*Math.pow(banKinh,2));
        System.out.println("Dien tich hinh tron = " + dienTich + " cm2");
    }
}
