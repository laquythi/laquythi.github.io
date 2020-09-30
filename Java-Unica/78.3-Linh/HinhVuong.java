/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author vando
 */
public class HinhVuong extends HinhChuNhat { 

    public HinhVuong(String mauSac, double chieuDaiCanh) {
        super(mauSac, chieuDaiCanh);
    }

     
    @Override
    void veHinh() {
        System.out.println("Ve hinh vuong");
    }

    @Override
    double tinhChuVi() {
        System.out.println("Chu vi hinh vuong : " + (chieuDai + chieuRong) * 2);
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    double tinhDienTich() {
        System.out.println("Dien tich hinh vuong : " + chieuDai * chieuRong);
        return chieuDai * chieuRong;
    }

    @Override
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String getMauSac() {
        return super.getMauSac();
    }

    @Override
    public void setChieuRong(double chieuRong) {
        this.chieuDai = chieuRong;
        this.chieuRong = chieuRong;
    }

    @Override
    public double getChieuRong() {
        return super.getChieuRong();
    }

    @Override
    public void setChieuDai(double chieuDai) {
        chieuDai = chieuRong;
        chieuRong = chieuDai;
    }

    @Override
    public double getChieuDai() {
        return super.getChieuDai();
    }

}
