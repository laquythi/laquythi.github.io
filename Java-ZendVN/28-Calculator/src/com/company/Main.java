package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// build a Calculator
//        int number1,number2;
//        int result;
//        String Calculate;
//        Scanner type = new Scanner(System.in);
//
//        System.out.println("Enter the first number");
//        number1 = type.nextInt();
//        type.nextLine();
//
//        System.out.println("Enter the second number");
//        number2 = type.nextInt();
//        type.nextLine();
//
//        System.out.println("Enter your calculate : ");
//        Calculate = type.nextLine();
//        type.close();
//
//        System.out.println("Number1 is " + number1);
//        System.out.println("Number2 is " + number2);
//        System.out.println("Calculate : " + Calculate);
//
//        switch(Calculate){
//            case "+":
//                result = number1 + number2;
//                System.out.println("result = " + result);
//                break;
//
//            case "-":
//                result = number1 - number2;
//                 System.out.println("result = " + result);
//                 break;
//
//            case "*":
//                result = number1 * number2;
//                System.out.println("result = " + result);
//                break;
//
//            case "/":
//                result = number1 / number2;
//                System.out.println("result = " + result);
//                break;
//        }

        double number1,number2;
        double result;
        String Calculator;

        Scanner type = new Scanner(System.in);

        System.out.println("Enter the first number:");
        number1 = type.nextDouble();
        type.nextLine();

        System.out.println("Enter the second number:");
        number2 = type.nextDouble();
        type.nextLine();

        System.out.println("Enter you calculator:");
        Calculator = type.nextLine();
        type.close();

        System.out.println("Number1 is " + number1);
        System.out.println("Number2 is " + number2);
        System.out.println("Calculator is " + Calculator);

        switch (Calculator){
            case "+":
                result = number1 + number2;
                System.out.println("result is " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("result is " + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("result is " + result);
                break;

            case "/":
                if(number2 == 0){
                    System.out.println("Math not true");
                    break;
                }else{
                    result = number1 / number2;
                    System.out.println("result is " + result);
                    break;
                }
        }
    }
}
