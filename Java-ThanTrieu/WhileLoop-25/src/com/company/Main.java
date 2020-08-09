package com.company;

public class Main {

    public static void main(String[] args) {
	// while loop
//        int i=0;
//        while (i < 100){
//            if (i % 5 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }

        // do while loop
        int i = 0;
            do {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
                i += 2;
            }while (i < 100);
        }
}
