package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap vao ban kinh hinh tron : ");
        float x = scanner.nextFloat();

        HinhTron.ChuVi(x);
        HinhTron.DienTich(x);

        System.out.println();
        System.out.println("moi ban nhap vao chieu dai canh hinh vuong : ");
        float y = scanner.nextFloat();
        HinhVuong.chuVi(y);
        HinhVuong.dienTich(y);
    }
}
