package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        boolean[][] booleans;
        String[][] strings;

        int[][] arr2 = {
                {4,7,2,7},
                {5,8,2,2},
                {3,6,1,1}
        };
//        for(int i=0;i< arr2.length;i++){
//            for(int j=0;j<arr2[0].length;j++){
//                System.out.print(arr2[i][j] + "\t");
//            }
//            System.out.println();
//        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
