package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        // 6 : nhap vao 1 mang a[n],gia su mang a da duoc sap xep tang dan,hay chen gia tri x vao mang a
        // sao cho van giu dc tinh sap xep cua mang
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n,x;
        n = sc.nextInt();
        System.out.println("nhap mang arr co " + n + " phan tu : ");
        arr = nhap(n,sc);
        System.out.println("nhap x : ");
        x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > x){
                index = i;
                break;
            }
        }
        
        if(index == -1){
            // chen vao cuoi
            arr[n] = x;
        }else {
            // dich phai toan bo cac ptu tu vi tri index
            for (int i = n; i > index ; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = x;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static int[] nhap(int n,Scanner sc){
        int[] x = new int[n+1];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        return x;
    }
}
