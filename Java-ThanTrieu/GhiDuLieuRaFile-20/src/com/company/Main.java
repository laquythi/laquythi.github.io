package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // ghi du lieu ra file
//        PrintWriter printWriter = new PrintWriter("C:\\Users\\laquy\\OneDrive\\Desktop\\ghiDuLieu.txt","UTF-8");
//        printWriter.println("demo ghi du lieu ra file");
//        printWriter.append("thanh cong ngay lan dau\n");
//        printWriter.append("tuy nhien van chua code dc nhu video 19,\n");
//        printWriter.append("dung duong dan C:\\Users\\laquy\\OneDrive\\Desktop de ghi file ra ngoai desktop,da thanh cong");
//        printWriter.close();

//        int x = 7;
//        if (x % 2 == 0) {
//            System.out.println(x + " la so chan");
//        } else {
//            System.out.println(x + " la so le");
//        }

        int age = 30;
        switch (age){
            case 7:
                System.out.println("di hoc tieu hoc");
            case 11:
                System.out.println("di hoc trung hoc co so");
            case 15:
                System.out.println("di hoc trung hoc pho thong");
                break;
            case 18:
                System.out.println("di hoc dai hoc");
                break;
            case 29:
                System.out.println("di lay vo");
                break;
            default:
                System.out.println("code nhanh con ngu");
        }
    }
}
