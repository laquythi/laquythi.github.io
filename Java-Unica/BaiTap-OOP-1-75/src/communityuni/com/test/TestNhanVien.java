package communityuni.com.test;

import communityuni.com.model.NhanVien;

import java.util.Scanner;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien nv1,nv2;
        System.out.println("moi ban nhap thong tin nhan vien ");

        System.out.println("ten nhan vien 1 la ");
        String ten1 = new Scanner(System.in).nextLine();
        System.out.println("so san pham cua nhan vien 1 la ");
        int sp1 = new Scanner(System.in).nextInt();

        System.out.println("ten nhan vien 2 la ");
        String ten2 = new Scanner(System.in).nextLine();
        System.out.println("so san pham cua nhan vien 2 la ");
        int sp2 = new Scanner(System.in).nextInt();

        nv1 = new NhanVien(ten1,sp1);
        nv2 = new NhanVien(ten2,sp2);

        // cach 1 : so sanh dung ham lonHon
        System.out.println("luong cua nhan vien 1 la " + nv1.getLuong());

        System.out.println("luong cua nhan vien 2 la " + nv2.getLuong());

//        if (nv1.lonHon(nv2) == true){
//            System.out.println("nhan vien 1 luong lon hon nhan vien 2 la : " + (nv1.getLuong() - nv2.getLuong()) );
//        }else{
//            System.out.println("nhan vien 2 luong lon hon nhan vien 1 la : " + (nv2.getLuong() - nv1.getLuong()));
//        }

        // cach 2 : so sanh ko dung ham lonHon
        if( (nv1.getLuong() - nv2.getLuong() > 0) ){
            System.out.println("nhan vien 1 luong lon hon nhan vien 2 la " + (nv1.getLuong() - nv2.getLuong()) );
        }else{
            System.out.println("nhan vien 2 luong lon hon nhan vien 1 la " + (nv2.getLuong() - nv1.getLuong()) );
        }
    }
}
