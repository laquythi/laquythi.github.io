package communityuni.com.test;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.DanhBa;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDanhBa {
    static ArrayList<DanhBa> dsDB = new ArrayList<DanhBa>();
    public static void menu(){
        System.out.println("1 Nhap : ");
        System.out.println("2 Xuat : ");
        System.out.println("3 Luu : ");
        System.out.println("4 Doc : ");
        System.out.println("5 Thoat : ");
        System.out.println("moi ban nhap Menu : ");
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
                doc();
                break;
            case 5 :
                System.err.println("cam on ban.");
                System.exit(0);
                break;
        }
    }
    private static void doc(){
        dsDB = SerializeFileFactory.readFile("D:/duLieu83.txt");
        xuat();
    }

    private static void luu(){
        boolean kq = SerializeFileFactory.saveFile(dsDB,"D:/duLieu83.txt");
        if(kq){
            System.out.println("luu file thanh cong");
        }
    }

    private static void xuat(){
        System.out.println("danh sach danh ba la : ");
        for(DanhBa db:dsDB){
            System.out.println(db);
        }
    }

    private static void nhap() {
        System.out.println("nhap ten : ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("nhap phone : ");
        String phone = new Scanner(System.in).nextLine();
        DanhBa db = new DanhBa(ten,phone);
        dsDB.add(db);
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
}
