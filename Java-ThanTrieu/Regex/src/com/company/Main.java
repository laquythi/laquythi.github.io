package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] fullName = {"Thi La Quy","Trang La","Phong Dai Ka","Hong Anh La","La Quy Thu","Mai Hoach","Lich Tran","Quoc Pham",
//        "Hung Tuan","Nhung La","Thao Ngan"};
        String input = " abc     xyz    lmno iht   al    ";
        String regex = "[\\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println(matcher.replaceAll("-"));
        }

//        for (int i = 0; i < fullName.length; i++) {
//            matcher = pattern.matcher(fullName[i]);
//            if(matcher.find()){
//                System.out.println(fullName[i]);
//            }
//        }
    }
}
