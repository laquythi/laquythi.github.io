package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String regex = "^[a-zA-Z]+[a-z0-9]*@{1}[a-zA-z]mail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("chuoi ban nhap dung dinh dang");
        }else{
            System.out.println("nhap lai chuoi");
        }
    }
}
