package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // van con bug
        int[] mang = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("vui long nhap vao gia tri cua mang");
        for(int i=0;i<mang.length;i++){
            mang[i] = scan.nextInt();
        }

        System.out.println("mang dc nhap vao la : ");
        for(int i=0;i<mang.length;i++){
            System.out.println(mang[i]);
        }

        System.out.println("nhap so muon tim kiem");
        int f = scan.nextInt();
        for(int i=0;i<mang.length;i++){
            if(f == mang[i]){
                int count = 1;
                System.out.println("tim thay phan tu " + f + " o vi tri " + i +  " trong mang");
                count++;
                System.out.println("phan tu " + f + " xuat hien " + count + " lan trong mang");
            }else{
                System.out.println("ko tim thay " + f + " trong mang");
            }
        }
    }
}
