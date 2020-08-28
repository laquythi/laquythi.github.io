package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class TestSinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
//        SinhVien thi = new SinhVien("la quy thi",7.8);
        SinhVien hellenTran = new SinhVien("thuy tran",9.5);
        System.out.println("diem hellenTran = " + hellenTran.getDiem());

//        System.out.println("ten cua sv la " + sv.getHoTen());
//
//        sv.setHoTen("random name 2");
//        System.out.println("ten cua sv 2 la " + sv.getHoTen());

        // method
        hellenTran.xuatThongTin();

        // toString method
//        System.out.println(hellenTran);
    }
}
