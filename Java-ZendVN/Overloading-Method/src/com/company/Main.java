package com.company;

public class Main {

    public static void main(String[] args) {
	// overloading method (nap chong phuong thuc) la nhung phuong thuc nam trong cung 1 class co cung ten nhung khac cac tham so
        Student studentOne = new Student();

//        studentOne.setCode("1131020126");
        studentOne.setCode();

//        studentOne.setCode("thi ",1131020126);
        System.out.println(studentOne.getCode());
    }
}
