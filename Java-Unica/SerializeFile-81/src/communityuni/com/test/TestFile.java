package communityuni.com.test;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.KhachHang;

import java.util.ArrayList;

public class TestFile {
    public static void main(String[] args) {
        // luu file
//        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
//        dsKH.add(new KhachHang(1,"hellen"));
//        dsKH.add(new KhachHang(2,"tracy"));
//        dsKH.add(new KhachHang(3,"trang lax"));
//        dsKH.add(new KhachHang(4,"memories"));
//
//        boolean kq = SerializeFileFactory.luuFile(dsKH,"D:/dataKhachHang.txt");
//        if(kq == true){
//            System.out.println("luu data thanh cong");
//        }else{
//            System.out.println("luu data ko thanh cong");
//        }

        // doc file
        Object data = SerializeFileFactory.docFile("D:/dataKhachHang.txt");
        ArrayList<KhachHang> dsKH = (ArrayList<KhachHang>) data;

        for(KhachHang kh: dsKH){
            System.out.println(kh.getMa() + " " + kh.getTen());
        }
    }
}
