package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// game di tim an so
        // Fail luc nao lam lai
        final int maxNumber = 100;
        final int minNumber = 1;
        int range = (maxNumber - minNumber) + 1;
        int secretNumber = (int)(Math.random() * range) + minNumber;

        Scanner sc = new Scanner(System.in);
        sc.close();

        int yourNumber = 0;
        while (secretNumber != yourNumber){
            System.out.println("Your number (1-100): ");
            yourNumber = sc.nextInt();
            sc.nextLine();

            if(yourNumber > secretNumber){
                System.out.println("so ban nhap lon hon so bi mat");
            }else if(yourNumber < secretNumber){
                System.out.println("so ban nhap nho hon so bi mat");
            }else{
                System.out.println("so ban nhap la so bi mat");
            }
        }
        sc.close();
    }
}
