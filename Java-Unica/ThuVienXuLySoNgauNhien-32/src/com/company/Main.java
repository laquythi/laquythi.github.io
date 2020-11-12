package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int x = rd.nextInt(100);
//        System.out.println(x); // equal 0 <= x <= 99

//        int y = -100 + rd.nextInt(201);
//        System.out.println(y); // equal -100 <= y <= 200

//        int z = -10 + rd.nextInt(21); // equal from -10 to 10
//        System.out.println(z); // -10 <= z <= 10.test done

//        int month = 1 + rd.nextInt(12) ; // equal from 1 to 12
//        System.out.println(month);
        doanSo();
    }

    public static void doanSo(){
       int count = 0;
        System.out.println("may tinh ra 1 so ngau nhien (0 - 10)");

        Random rd = new Random();
        int soMayTinhDoan = rd.nextInt(10);

        do {
            System.out.println("moi ban nhap so can doan ");
            int soNguoiDoan = new Scanner(System.in).nextInt();

            if(soNguoiDoan == soMayTinhDoan){
                System.out.println("ban doan dung,so may tinh doan = " + soMayTinhDoan);

                System.out.println("ban co muon choi tiep khong ? (c/k)");

                String traLoi = new Scanner(System.in).nextLine();
                if(traLoi.equalsIgnoreCase("c")){
                    doanSo();
                }else{
                    break;
                }
            }else{
                System.out.println("ban doan sai");
                count++;
                if(count == 7){
                    System.out.println("ban doan sai qua 7 lan cho phep,so may tinh doan la " + soMayTinhDoan);

                    System.out.println("ban co muon choi tiep khong ? (c/k)");

                    String traLoi = new Scanner(System.in).nextLine();
                    if(traLoi.equalsIgnoreCase("c")){
                        doanSo();
                    }else{
                        break;
                    }
                }
            }
        }while (count < 7);

    }
}
