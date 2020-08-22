package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String arr;
        System.out.println("moi ban nhap chuoi : ");
        arr = sc.nextLine();
        char[] arr1 = arr.toCharArray();
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr1[arr1.length-i-1]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("chuoi " + arr + " ban vua nhap la chuoi doi xung");
        }else{
            System.out.println("chuoi " + arr + " ban vua nhap ko phai la chuoi doi xung");
        }
    }
}
