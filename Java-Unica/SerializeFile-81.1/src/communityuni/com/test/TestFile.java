package communityuni.com.test;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.KhachHang;

import java.util.ArrayList;

public class TestFile {
    public static void main(String[] args) {
        // luu file
//        ArrayList<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
//        dsKhachHang.add(new KhachHang(1,"hellen"));
//        dsKhachHang.add(new KhachHang(2,"trang la"));
//        dsKhachHang.add(new KhachHang(3,"nhung la"));
//
//        boolean kq = SerializeFileFactory.luuFile(dsKhachHang,"D:/dataKhachHang81.1");
//        if (kq){
//            System.out.println("luu data thanh cong.");
//        }else{
//            System.out.println("luu data that bai.");
//        }

        // doc file
        Object data = SerializeFileFactory.docFile("D:/dataKhachHang81.1");
        ArrayList<KhachHang> dsKh = (ArrayList<KhachHang>) data;

        for(KhachHang kh:dsKh){
            System.out.println(kh.getMa() + " " + kh.getTen());
        }
    }
}
