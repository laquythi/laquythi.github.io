package com.company;

public class Main {

    public static void main(String[] args) {
        // in bang cuu chuong don gian
        // su dung for
//        int p = 2;
//        for(int i=1;i<=9;i++){
//            System.out.println(p + " x " + i + " = " + p*i);
//        }

        // su dung do while
//        int i = 1;
//        do {
//            System.out.println(p + " x " + i +  " = " + p*i);
//            i++;
//        }while (i<=10);

        // bang cuu chuong phuc tap
        for(int i=1;i<=9;i++){
            System.out.println("bang cuu chuong " + i);
            for(int j=1;j<=10;j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("");
        }
    }
}
