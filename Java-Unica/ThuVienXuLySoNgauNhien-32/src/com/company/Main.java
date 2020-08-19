package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rd = new Random();
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
        for (int i = 0; i < 100; i++) {
            Random rd = new Random();
            int number = 0 + rd.nextInt(10);
            System.out.println(number);
            if(number == 7){
                System.out.println("day la ngay sinh cua toi");
                break;
            }else{
                System.out.println("day ko la ngay sinh cua toi");
                count++;
                if(count == 5){
                    System.out.println("ban doan sai qua so lan cho phep");
                    System.out.println("ban co muon choi tiep ko ? (c/k)");
                    String traLoi = new Scanner(System.in).nextLine();
                    if (traLoi.equalsIgnoreCase("k")){
                        break;
                    }else{
                        doanSo();
                    }
                }
            }
        }
    }
}
