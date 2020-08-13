package com.company.module;

public class Student {
    private String name;
    private String address;
    private int studentId;

   public static int id = 1000;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        studentId = id;
        id++;
    }

}
