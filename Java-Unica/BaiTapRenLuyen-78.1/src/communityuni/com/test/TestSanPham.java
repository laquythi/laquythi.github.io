package communityuni.com.test;

import communityuni.com.model.DanhMucSanPham;
import communityuni.com.model.SanPham;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TestSanPham {
    public static void main(String[] args) {
       ArrayList<SanPham> sanPhams;
       nhapDanhMucSanPham();
//       xuatDanhMucSanPham();
    }

    public static void nhapDanhMucSanPham(){
//        SanPham sp = new SanPham(1,"cigar cuban",1,"sach 0-1",90.5,"viet nam");
//        System.out.println("chi tiet san pham ban vua nhap la ");
//        System.out.println("danh muc = " + sp.getMaDanhMuc() + " ten danh muc = " + sp.getTenDanhMuc());

        DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
        SanPham sp = new SanPham();
        sp.setMaDanhMuc(1);
        sp.setTenDanhMuc("cigar cuban");
        sp.setMaSanPham(11);
        sp.setTenSanPham("cohiba");
        sp.setGiaSanPham(50);
        sp.setXuatXu("Cuba");
    }

    public static void xuatDanhMucSanPham(){
        SanPham sp = new SanPham();
        System.out.println("chi tiet san pham ban vua nhap la ");
        System.out.println("danh muc = " + sp.getMaDanhMuc() + " ten danh muc = " + sp.getTenDanhMuc());
    }
}
