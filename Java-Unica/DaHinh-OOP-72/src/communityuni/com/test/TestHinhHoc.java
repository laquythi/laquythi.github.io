package communityuni.com.test;

import communityuni.com.model.HinhChuNhat;
import communityuni.com.model.HinhHoc;
import communityuni.com.model.HinhVuong;

public class TestHinhHoc {
    public static void main(String[] args) {
        HinhHoc h;
        h = new HinhChuNhat(4,6);
        System.out.println("chu vi = " + h.tinhChuVi());
        System.out.println("dien tich = " + h.tinhDienTich());

        System.out.println("--------------");
        h = new HinhVuong(7);
        System.out.println("chu vi hinh vuong = " + h.tinhChuVi());
        System.out.println("dien tich hinh vuong = " + h.tinhDienTich());

        System.out.println("-------------");
        HinhChuNhat hv1 = new HinhVuong(6);
        System.out.println("chu vi hinh chu nhat = " + hv1.tinhChuVi());
        System.out.println("dien tich hinh chu nhat = " + hv1.tinhDienTich());
    }
}
