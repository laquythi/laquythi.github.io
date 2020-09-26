package communityuni.com.test;

import communityuni.com.model.Hinh;
import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhTron;
import communityuni.com.model.HinhVuong;

import java.util.Scanner;

public class KiemTraHinh {
    public static void main(String[] args) {
        Hinh hinhChuNhat = new HinhChuNhat("blue",4.0,5.0);
        System.out.println("chu vi hinh chu nhat la " + hinhChuNhat.tinhChuVi() + " \ndien tich hinh chu nhat la " + hinhChuNhat.tinhDienTich()
        + "\nmau sac hinh chu nhat la " + hinhChuNhat.getMau()
        );

        // mau sac hinh tron va hinh vuong lam tuong tu nhu hinh chu nhat
        Hinh hinhVuong = new HinhVuong("orange",5.0);
        System.out.println("------------\nchu vi hvuong la " + hinhVuong.tinhChuVi() + "\ndien tich hvuong la " + hinhVuong.tinhDienTich()
        + " \nmau sac cua hinh vuong la " + hinhVuong.getMau()
        );

        Hinh hinhTron = new HinhTron(4.5);
        System.out.println("------\nchu vi hinh tron la " + hinhTron.tinhChuVi() + "\ndien tich hinh tron la " + hinhTron.tinhDienTich());
    }
}
