package communityuni.com.test;

import communityuni.com.model.NhanVien;

public class TestNhanVien{
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien(1,"thi");
//        NhanVien nv2 = new NhanVien(2,"hellen");
//        nv1 = nv2; // nv1 tro den vung nho ma nv2 dang quan ly
//        chi can nv1 hoac nv2 thay doi thi ca 2 se thay doi

//        nv2.setTen("memories");
//        System.out.println("ten cua nhan vien 1 la " + nv1.getTen()); // luc nay ten nv1 se la "memories".
//        nv1.setTen("thuy tran");
//        System.out.println("ten cua nhan vien 2 la " + nv2.getTen()); // thuy tran

        System.out.println("---------------------");

//        NhanVien nv3 = new NhanVien(3,"trang");
//        NhanVien nv4 = new NhanVien(4,"nhung");
//        nv4 = nv3.copy();
//
//        System.out.println("ten cua nhan vien 4 la " + nv4.getTen()); // trang
//        nv3.setTen("ngan");
//        System.out.println("ten cua nhan vien 4 la " + nv4.getTen()); // trang
//        System.out.println("---------------");
//        System.out.println("ten cua nhan vien 3 la " + nv3.getTen()); // ngan

        NhanVien nv5 = new NhanVien(5,"hong anh");
        NhanVien nv6 = new NhanVien(6,"quy phong");

        nv5 = nv6.copy();

        System.out.println("ten cua nhan vien 5 la " + nv5.getTen()); // quy phong
        nv5.setTen("la quy khiem");
        System.out.println("ten cua nhan vien 5 la " + nv5.getTen()); // la quy khiem
        System.out.println("ten cua nhan vien 6 la " + nv6.getTen()); // quy phong
        System.out.println("----------------");

    }
}
