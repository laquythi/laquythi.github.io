package communityuni.com.model;

import communiyuni.com.util.DateConverter;

import java.io.Serializable;
import java.util.Date;

public class KhachHang implements Serializable {
    private int ma;
    private String ten;
    private Date namSinh;

    // constructor

    public KhachHang(int ma, String ten, Date namSinh) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public KhachHang() {
        super();
    }

    // getter setter
    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }

    // toString
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + DateConverter.formDate(this.namSinh);
    }
}
