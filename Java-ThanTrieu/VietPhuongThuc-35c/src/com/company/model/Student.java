package com.company.model;

public class Student {
    private String StudentId;
    private String name;
    private int StudentYears;
    private float StudentAvgMark;
    private String faculty;

    public void goToScholl(){

    }
    public void study(){

    }
    public void doExample(){

    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentYears() {
        return StudentYears;
    }

    public void setStudentYears(int studentYears) {
        StudentYears = studentYears;
    }

    public float getStudentAvgMark() {
        return StudentAvgMark;
    }

    public void setStudentAvgMark(float studentAvgMark) {
        StudentAvgMark = studentAvgMark;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
