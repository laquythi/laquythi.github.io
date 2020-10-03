package communityuni.com.test;

import communityuni.com.io.TextFileFactory;
import communityuni.com.model.KhachHang;
import communiyuni.com.util.DateConverter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestKhachHang {
    static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
    public static void menu(){
        System.out.println("1. nhap : ");
        System.out.println("2. xuat : ");
        System.out.println("3. luu : ");
        System.out.println("4. Mo file : ");
        System.out.println("5.Thoat : ");
        System.out.println("moi ban chon menu : ");
        int n = new Scanner(System.in).nextInt();
        switch (n){
            case 1 :
                nhap();
                break;
            case 2 :
                xuat();
                break;
            case 3 :
                luu();
                break;
            case 4 :
                moFile();
                break;
            case 5 :
                System.out.println("tam biet .");
                System.exit(0);
                break;
        }
    }

    private static void moFile() {
        dsKH = TextFileFactory.readFile("D://dulieu.txt");
    }

    private static void luu() {
        if(TextFileFactory.saveFile(dsKH,"D://dulieu.txt") == true){
            System.out.println("luu file thanh cong.");
        };
    }

    private static void xuat() {
        for(KhachHang kh: dsKH){
            System.out.println(kh);
        }
    }

    private static void nhap() {
        System.out.println("moi ban nhap ma : ");
        int ma = new Scanner(System.in).nextInt();
        System.out.println("moi ban nhap ten : ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("moi ban nhap nam sinh (dd/MM/yy) : ");
        Date ns = DateConverter.formString(new Scanner(System.in).nextLine());

        KhachHang kh = new KhachHang(ma,ten,ns);
        dsKH.add(kh);
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
}
