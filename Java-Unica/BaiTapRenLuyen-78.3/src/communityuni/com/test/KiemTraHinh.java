package communityuni.com.test;

import communityuni.com.model.Hinh;
import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhTron;
import communityuni.com.model.HinhVuong;

import java.util.Scanner;

public class KiemTraHinh {
    public static void main(String[] args) {
        // cach 1 :
//        Hinh hinhChuNhat = new HinhChuNhat("blue",4.0,5.0);
//        System.out.println("chu vi hinh chu nhat la " + hinhChuNhat.tinhChuVi() + " \ndien tich hinh chu nhat la " + hinhChuNhat.tinhDienTich()
//        + "\nmau sac hinh chu nhat la " + hinhChuNhat.getMau()
//        );
//
//        // mau sac hinh tron va hinh vuong lam tuong tu nhu hinh chu nhat
//        Hinh hinhVuong = new HinhVuong("orange",5.0);
//        System.out.println("------------\nchu vi hvuong la " + hinhVuong.tinhChuVi() + "\ndien tich hvuong la " + hinhVuong.tinhDienTich()
//        + " \nmau sac cua hinh vuong la " + hinhVuong.getMau()
//        );
//
//        Hinh hinhTron = new HinhTron(4.5);
//        System.out.println("------\nchu vi hinh tron la " + hinhTron.tinhChuVi() + "\ndien tich hinh tron la " + hinhTron.tinhDienTich());


        // cach 2
          Hinh h;
          Scanner sc = new Scanner(System.in);

        // hinh chu nhat
//        System.out.println("nhap mau sac cho hinh CN : ");
//        String mau = sc.nextLine();
//
//        System.out.println("nhap chieu dai hinh CN : ");
//        double chieuDai = sc.nextDouble();
//
//        System.out.println("nhap chieu rong hinh CN : ");
//        double chieuRong = sc.nextDouble();
//
//        h = new HinhChuNhat(mau,chieuDai,chieuRong);
//        System.out.println("chu vi hinh CN la " + h.tinhChuVi() + "\ndien tich hinh CN la " + h.tinhDienTich() + "\nmau sac " + h.getMau());

        // hinh vuong
//        System.out.println("nhap mau sac cho hinh vuong : ");
//        String mau = sc.nextLine();
//
//        System.out.println("nhap chi rong hinh vuong : ");
//        double doRong = sc.nextDouble();
//
//        h = new HinhVuong(mau,doRong);
//
//        System.out.println("chu vi hinh vuong la " + h.tinhChuVi() + "\ndien tich hinh vuong la " + h.tinhDienTich() + "\nmau sac " + h.getMau());
//
//        System.out.println(h.layThongTin());


        // hinh tron
        System.out.println("nhap mau sac cho hinh tron : ");
        String mau = sc.nextLine();

        System.out.println("nhap ban kinh : ");
        double banKinh = sc.nextDouble();

        h = new HinhTron(mau,banKinh);

        System.out.println("chu vi hinh tron la " + h.tinhChuVi() + "\ndien tich hinh tron la " + h.tinhDienTich() + "\nmau sac " + h.getMau());

        System.out.println(h.layThongTin());


    }
}
