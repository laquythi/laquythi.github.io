package com.company;

import com.company.model.Student;

public class Main {

    public static void main(String[] args) {
	// lop va doi tuong
        // setter va getter

        Student studentA = new Student();
        studentA.setStudentId("1131020126");
        String aId = studentA.getStudentId();
        System.out.println(aId);

        Student studentB = new Student();
        studentB.setName("memories phamm");
        String bName = studentB.getName();
        studentB.setFaculty("information techonoly");
        String bFaculty = studentB.getFaculty();
        System.out.println(bName + " " + bFaculty);

        studentA.setName("la quy thi");
        String aName = studentA.getName();
        studentA.setFaculty("mechatronic");
        String aFaculty = studentA.getFaculty();
        System.out.println(aName + " " + aFaculty);


    }


}
