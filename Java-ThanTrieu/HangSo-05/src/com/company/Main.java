package com.company;


public class Main {
    public static double Pi = 3.14960303;
    public static double G = 9.789f;
    public static void main(String[] args) {
	// write your code here
        showGValue();
        showPiValue();
    }

    public static void showGValue(){
        System.out.println("value of G = " + G);
    }
    public static void showPiValue(){
        System.out.println("value of Pi = " + Pi);
    }
}
