package communityuni.com.test;

import communityuni.com.model.TamGiac;

public class TestTamGiac {
    public static void main(String[] args) {
//        TamGiac tg = new TamGiac(13,15,20);
//        System.out.println("chu vi tam giac = " + tg.tinhChuVi());
//        System.out.println("dien tich tam giac = " + tg.tinhDienTich());
//        System.out.println("nua chu vi tam giac = " + tg.tinhChuVi()/2);

        TamGiac tg2 = new TamGiac(); // tra ve : "day la constructor mac dinh";
        System.out.println("chu vi tam giac = " + tg2.tinhChuVi()); // ket qua = 3.0
    }
}
