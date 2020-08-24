package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] M = {1,5,3,2,5};
        int[] M2;
        int n = M.length + 1;
        M2 = new int[n];
        for (int i = 0; i < M.length; i++) {
            M2[i] = M[i];
        }
        M2[M2.length - 1] = 2;
        for (int i = 0; i < M2.length; i++) {
            System.out.print(M2[i] + " ");
        }
    }
}
