package com.company;

import com.company.module.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// constructor : dung de khoi tao gia tri cho doi tuong cua class tuong ung
        // cung ten voi ten class,vi du class Student se co constructor Student();
        // 1 lop co the co nhieu constructor
        // 1 phuong thuc khoi tao co the co 0 hoac 1 hoac nhieu tham so
        // constructor ko tra ve
        // construtor luon duoc goi voi toan tu new,vi du Scanner sc = new Scanner(System.in);


//        Scanner sc = new Scanner(System.in);
//        student.setName("memories phamm");
//        student.setAge(28);
//        student.setAddress("quang ninh");
//        System.out.println(student.getName() + " " +  student.getAge() + " " + student.getAddress());

        Student student = new Student(1131020126,"la quy thi","thai binh");
        System.out.println("studentId = " + student.getStudentId() + " studentName = " + student.getStudentName() +
               " studentAddress = " + student.getStudentAddress() );

        Student student2 = new Student(369273372,"pham thi thu","quang ninh");
        System.out.println("studentId = " + student2.getStudentId() + " studentName = " + student2.getStudentName() +
                " studentAddress = " + student2.getStudentAddress() );
    }
}
