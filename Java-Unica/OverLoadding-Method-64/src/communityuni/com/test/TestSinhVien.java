package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class TestSinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien(1,"thi",8.5);
        sv.xetTotNghiep();
        sv.xetTotNghiep(4.8);
        sv.xetTotNghiep(10.0,2);
    }
}
