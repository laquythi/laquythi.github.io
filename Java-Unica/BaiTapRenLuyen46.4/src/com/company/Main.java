package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dem so ky tu viet HOA,viet thuong
        System.out.println("moi ban nhap vao 1 chuoi ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int numberOfUppercaseLetters =
                Long.valueOf(input.chars().filter(c -> Character.isUpperCase(c)).count())
                        .intValue();
        int numberOfLowercaseLetters =
                Long.valueOf(input.chars().filter(c -> Character.isLowerCase(c)).count())
                        .intValue();
        System.out.println("Do dai cua chuoi ban nhap la " + input.length()
                + " \nso ky tu viet HOA la " + numberOfUppercaseLetters
                + " \nso ky tu viet thuong la " + numberOfLowercaseLetters);

        // dem so nguyen am,phu am,khoang trang,ky tu so
        int countPhuAm = 0;
        int countNguyenAm = 0;
        int countKyTuSo = 0;
        int whiteSpace = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'u' || input.charAt(i) == 'e' || input.charAt(i) == 'o'
            || input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'U' ||
                    input.charAt(i) == 'O' || input.charAt(i) == 'A' || input.charAt(i) == 'I' ){
                countPhuAm++;
            }else if(input.charAt(i) == ' '){
                whiteSpace++;
            }else if(input.charAt(i) == '0' || input.charAt(i) == '1' || input.charAt(i) == '2' || input.charAt(i) == '3'
                    || input.charAt(i) == '4' || input.charAt(i) == '5' || input.charAt(i) == '6' || input.charAt(i) == '7'
            || input.charAt(i) == '8' || input.charAt(i) == '9' ){
                countKyTuSo++;
            }else{
                countNguyenAm++;
            }
        }
        System.out.println("so nguyen am cua chuoi la " + countNguyenAm + " \n so phu am cua chuoi la " + countPhuAm);
        System.out.println("so ky tu la So trong chuoi la " + countKyTuSo);
        System.out.println("so khoang trang trong chuoi la " + whiteSpace);

        // dem so luong ky tu la So trong chuoi
//        for (int i = '0'; i < '9'; i++) {
//            for (int j = 0; j < input.length(); j++) {
//                if(input.charAt(j) == i){
//                    countKyTuSo++;
//                }
//            }
//        }

    }

}
