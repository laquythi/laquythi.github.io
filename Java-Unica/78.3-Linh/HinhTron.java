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
public class HinhTron extends Hinh{
    
    int banKinh;

    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    
    

    @Override
    double tinhDienTich() {
        System.out.println("Dien Tich Hinh Tron: " + banKinh * banKinh * 3.14);
         return banKinh * banKinh * 3.14;
    }

    @Override
    double tinhChuVi() {
        return banKinh * 2 * 3.14;
    }

    @Override
    void veHinh() {
        System.out.println("Ve Hinh Tron");
    }
    
}
