package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 1 bai tap choi game doan so:
        int count = 5;
            do {
                int random = new Random().nextInt(5); // so ngau nhien tu 0 - 5
//                System.out.println("so ngau nhien la " + random); // lay dc so ngau nhien tu 0 - 5;
                System.out.println("moi nguoi choi doan so,luu y doan trong khoang 0 - 5 : ");
                int nguoiChoiDoan;
                Scanner sc = new Scanner(System.in);
                nguoiChoiDoan = sc.nextInt();
                System.out.println("so nguoi choi doan la : " + nguoiChoiDoan);
                if(nguoiChoiDoan == random){
                    System.out.println("ban doan dung 1 lan.");
                    count++;
                    System.out.println("so diem cua ban la " + count);
                }else{
                    System.out.println("ban doan sai 1 lan.");
                    count--;
                    System.out.println("so diem cua ban la " + count);
                }
//            System.out.println(count);
                if(count == 10){
                    System.out.println("congratulation !");
                    break;
                }else if(count == 0){
                    System.out.println("Game over !");
                    break;
                }
            }while (count > 0);
    }
}
