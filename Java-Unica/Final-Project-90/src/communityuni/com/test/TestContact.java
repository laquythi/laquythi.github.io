package communityuni.com.test;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.Contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestContact {
    // hashMap
    static HashMap<Integer, Contact> csdl = new HashMap<Integer,Contact>();

    // menu
    public static void menu() {
        System.out.println("1 Them : ");
        System.out.println("2 Xuat : ");
        System.out.println("3 Sua : ");
        System.out.println("4 Xoa : ");
        System.out.println("5 Tim kiem : ");
        System.out.println("6 Sap xep : ");
        System.out.println("7 Luu file : ");
        System.out.println("8 Doc file : ");
        System.out.println("9 Thoat : ");

        System.out.println("moi ban nhap menu : ");
        int n = new Scanner(System.in).nextInt();

        switch (n) {
            case 1:
                them();
                break;
            case 2:
                xuat();
                break;
            case 3:
                sua();
                break;
            case 4:
                xoa();
                break;
            case 5:
                timKiem();
                break;
            case 6:
                sapXep();
                break;
            case 7:
                luuFile();
                break;
            case 8:
                docFile();
                break;
            case 9:
                System.err.println("cam on ban.");
                System.exit(0);
                break;
        }
    }

    private static void docFile() {
        csdl = SerializeFileFactory.readFile("D:/final-project-90.txt");
    }

    private static void luuFile() {
        SerializeFileFactory.saveFile(csdl,"D:/final-project-90.txt");
    }

    private static void sapXep() {
    }

    private static void xoa() {
        System.out.println("nhap Ma : ");
        int ma = new Scanner(System.in).nextInt();
        if(csdl.containsKey(ma)){
            csdl.remove(ma);
            luuFile();
        }else{
            System.out.println("ko tim thay ma vua nhap trong co so du lieu.");
        }
        luuFile();
    }
    private static void timKiem() {
        // tim theo phone
//        System.out.println("nhap Phone : ");
//        String phone = new Scanner(System.in).nextLine();
//        for (Map.Entry<Integer,Contact> item : csdl.entrySet()){
//            if (item.getValue().getPhone().startsWith(phone)){
//                System.out.println(item.getValue());
//            }
//        }

        // tim theo ten
        System.out.println("nhap Name : ");
        String name = new Scanner(System.in).nextLine();

        for (Map.Entry<Integer,Contact> item : csdl.entrySet()){
            if(item.getValue().getName().startsWith(name)){
                System.out.println(item.getValue());
            }
        }
    }

    private static void sua() {
        System.out.println("nhap Ma muon sua : ");
        int ma = new Scanner(System.in).nextInt();
        if(csdl.containsKey(ma)){
            // copy from them method
            System.out.println("nhap Ten : ");
            String ten = new Scanner(System.in).nextLine();

            System.out.println("nhap Phone : ");
            String phone = new Scanner(System.in).nextLine();

            Contact contact = new Contact(ma,ten,phone);
            csdl.put(ma,contact);
        }else {
            System.out.println("Ma chua ton tai trong co so du lieu.");
        }
    }

    private static void xuat() {
        System.out.println("danh sach danh ba la : ");
        for (Map.Entry<Integer,Contact> item : csdl.entrySet()){
            // item.getValue() se goi den ham toString cua class Contact
            System.out.println(item.getValue());
        }
    }

    private static void them() {
        System.out.println("nhap Ma : ");
        int ma = new Scanner(System.in).nextInt();

        System.out.println("nhap Ten : ");
        String ten = new Scanner(System.in).nextLine();

        System.out.println("nhap Phone : ");
        String phone = new Scanner(System.in).nextLine();

        Contact contact = new Contact(ma,ten,phone);

        // kiem tra trong co so du lieu da ton tai Id vua nhap hay chua,neu chua     thi put moi du lieu vao hashMap
        if(csdl.containsKey(contact.getId()) == false){
            csdl.put(contact.getId(),contact);
            luuFile();
        }
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
}
