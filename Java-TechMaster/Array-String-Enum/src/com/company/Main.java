package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// mang 1 chieu
//        String[] names = {"thi","phog","anh","nhung","trang","tra","ngan"};
//        for(int i=0;i<names.length;i++){
//            System.out.printf(names[i] + " ");
//        }

        // mang 2 chieu
//        int arr[][] = {
//                {1,6,1,4,5,6,2,8,34,2},
//                {54,1,54,675,21,254,1,5,5,12},
//                {8,2,3,1,62,5,3,5,1,6}
//        };
////        int number = arr[1][3];
////        System.out.println(number);
//        for(int i=0;i<3;i++){
//            for(int j=0;j<10;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("\n");
//        }

        // array sort
        int arr[] = {4,7,1,3,98,1,2,9,1,3,6,1,3,78,33,8};
        Arrays.sort(arr);
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so can tim:");
        int number = input.nextInt();

        int result = Arrays.binarySearch(arr,number);
        System.out.println(result);
    }
}
