package com.company;

import com.company.module.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // static la tu khoa dung cho cac phuong thuc co the dung chung,
        // trong vi du nay,tai lop Student co thuoc tinh id dat trong tu khoa static (public static int id = 1000)
        Student student1 = new Student();
        student1.setStudentId();

        Student student2 = new Student();
        student2.setStudentId();

        Student student3 = new Student();
        student3.setStudentId();

        Student student4 = new Student();
        student4.setStudentId();

        System.out.println(student1.getStudentId()); // 1000
        System.out.println(student2.getStudentId()); // 1001
        System.out.println(student3.getStudentId()); // 1002
        System.out.println(student4.getStudentId()); // 1003
    }
}
