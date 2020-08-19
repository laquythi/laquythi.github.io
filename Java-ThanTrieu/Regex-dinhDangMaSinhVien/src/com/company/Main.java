package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String input = "B19DCCN279";
//        String regex = "^[bBcC]{1}\\d{2}[dDcCnNqQTssSkK]{4}\\d{3}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//
//        if(matcher.find()){
//            System.out.println("ma sinh vien hop le");
//        }else{
//            System.out.println("ko hop le");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi");
        String line = new Scanner(System.in).nextLine();

        System.out.println("chuoi ban vua nhap la : " + line);
    }
}
