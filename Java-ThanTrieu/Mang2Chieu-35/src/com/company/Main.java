package com.company;

public class Main {

    public static void main(String[] args) {
//        int[][] arr = new int[4][5];
//        boolean[][] booleans;
//        String[][] strings;
//
//        int[][] arr2 = {
//                {4,7,2,7},
//                {5,8,2,2},
//                {3,6,1,1}
//        };
//        for(int i=0;i< arr2.length;i++){
//            for(int j=0;j<arr2[0].length;j++){
//                System.out.print(arr2[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

        // su dung foreach de truy xuat mang 2 chieu
        int[][] arr = {
                {4,5,6,7},
                {1,6,2,3},
                {9,3,7,8},
                {5,7,2,3}
        };
        System.out.println("mang 2 chieu truy xuat bang foreach : ");
        for (int[] x : arr) {
            for (int y:x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
