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
public class HinhChuNhat extends Hinh{

    double chieuDai;
    double chieuRong; 
    String mauSac;
    

    public HinhChuNhat(String mauSac,double chieuDai, double chieuRong ) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong; 
        this.mauSac = mauSac;
    }

    public HinhChuNhat(String mauSac,double chieuDaiCanh) {
        this.mauSac = mauSac;
        this.chieuDai = this.chieuRong = chieuDaiCanh;
    }

    
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    
 
    @Override
    double tinhDienTich() {
         System.out.println("Dien tich hinh chu nhat :  " + chieuDai * chieuRong);   
        return chieuDai * chieuRong;
    }

    @Override
    double tinhChuVi() {
        System.out.println("Chu vi hinh chu nhat: " + (chieuDai + chieuRong ) *2);   
        return tinhChuVi();
    }

    @Override
    void veHinh() {
        System.out.println("Ve Hinh Chu Nhat");
    }
    
}
