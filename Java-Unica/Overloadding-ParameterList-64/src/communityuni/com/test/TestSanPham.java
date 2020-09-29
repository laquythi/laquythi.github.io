package communityuni.com.test;

import communityuni.com.model.SanPham;

public class TestSanPham {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(1,"cocacola",10.0);
        SanPham sp2 = new SanPham(2,"pepsi",9.5);
        SanPham sp3 = new SanPham(3,"Sting",8.0);

        double t = SanPham.tongTien(sp1,sp2,sp3);
        System.out.println(t); // 27.5

        double t2 = SanPham.tongTien(sp1,sp3);
        System.out.println(t2); // 18.0
    }
}
