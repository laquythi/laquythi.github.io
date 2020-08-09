package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int[] arr = new int[100];
//        for(int i = 1;i <= arr.length;i++){
//            int count = 0;
//            System.out.print(i + "\t");
//            if(i % 10 == 0){
//                count++;
//                System.out.println();
//            }
//        }

        int[] arr = new int[10];
        arr[0] = 13;
        arr[1] = 54;
        arr[9] = 3;
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
