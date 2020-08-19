package com.company;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fullName = "la quy thi dong hung thai binh";
//        int p = fullName.indexOf("thi");
//        System.out.println("tim thay ky tu [thi] tai vi tri thu " + p + " trong chuoi fullName");
//
//        int first = fullName.indexOf("i");
//        System.out.println("tim thay ky tu [i] tai vi tri thu " + first + " trong chuoi fullName");
//
//        int last = fullName.lastIndexOf("i");
//        System.out.println("tim thay ky tu [i] xuat hien lan cuoi tai vi tri thu " + last + " trong chuoi fullName");
//
//        boolean tonTai = fullName.contains("memories");
//        if(tonTai == true){
//            System.out.println("[memories] co ton tai trong chuoi fullName");
//        }else{
//            System.out.println("[memories] ko ton tai trong chuoi fullName");
//        }
        StringTokenizer token = new StringTokenizer(fullName);
        int count = 0;
        while (token.hasMoreTokens()){
            String value = token.nextToken();
            if(value.contains("i")){
                count++;
            }
        }
        System.out.println("[i] xuat hien " + count + " lan trong chuoi");

    }
}
