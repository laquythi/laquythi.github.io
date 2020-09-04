package communityuni.com.test;

import communityuni.com.model.SinhVien;

import java.util.ArrayList;

public class TestSinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();
        dsSv.add(new SinhVien(1,"thi",5.5));
        dsSv.add(new SinhVien(1,"hellen",9.5));
        dsSv.add(new SinhVien(3,"memories",7.5));

        System.out.println("danh sach sinh vien la :");
        for (SinhVien sv: dsSv) {
            System.out.println(sv);
        }
    }
}
