package com.company;

import java.awt.*;
import java.util.Calendar;

public class Person {
    public String name;
    public String code;
    public int birthday;


    // Constructor
//    public Person(String vName,String vCode,int birthday){
//        this.name = vName;
//        this.code = vCode;
//        this.birthday = birthday;
//    }

    // setter to generate intelliJ
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    // getter to generate intelliJ
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getAge(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }

    // show Info
    public void showInfo(){
        System.out.println("Person Info:");
        System.out.println("-------------");
        System.out.println("Name : " + this.getName());
        System.out.println("Code : " + this.getCode());
        System.out.println("Birthday : " + this.getBirthday());
        System.out.println("Age : " + this.getAge());
    }
}
