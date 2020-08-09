package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // String Method (API)
        String name = "la quy thi dong hung thai binh";
//        String fatherName = "";
//        fatherName = name.replace("thi","thu");
//        System.out.println(fatherName); // la quy thu

//        System.out.println(name.toCharArray());
//        System.out.println(name.toUpperCase());

//        String nameArr[] = name.split(" ");
//        for(String s : nameArr){
//            System.out.println(s); // one word on one line
//        }

        System.out.println(name.startsWith("thi")); // false
        System.out.println(name.endsWith("binh")); // true
    }
}
