package communityuni.com.test;

import communityuni.com.model.SanPham;

import java.util.ArrayList;
import java.util.Collections;

public class TestSanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSp = new ArrayList<SanPham>();
        dsSp.add(new SanPham(1,12,"coca cola"));
        dsSp.add(new SanPham(2,20,"pepsi"));
        dsSp.add(new SanPham(3,8,"sting"));
        dsSp.add(new SanPham(4,10,"number One"));

        System.out.println("danh sach san pham : ");
        for (SanPham sp: dsSp) {
            System.out.println(sp);
        }

        System.out.println("danh sach san pham sau khi sap xep la : ");
        Collections.sort(dsSp);
        for (SanPham sp: dsSp) {
            System.out.println(sp);
        }
    }
}
