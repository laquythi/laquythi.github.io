package com.company;

import java.time.Year;
import java.util.Calendar;

public class Student {
    public String name;
    public String address;
    public int age;
    public String code;
    public int BirthDay;

    //setter
    public void setName(String sname){
        this.name = sname;
    }
    public void setAddress(String sAddress){
        this.address = sAddress;
    }
    public void setAge(int sAge){
        this.age = sAge;
    }
    public void setCode(String sCode){
        this.code = sCode;
    }

    //getter
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
//    public int getAge(){
//        return this.age;
//    }
    public String getCode(){
        return this.code;
    }

    // getAge method
    public int getAge(){
        int age = 0;
        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.YEAR));
        age = now.get(Calendar.YEAR) - this.getBirthDay();
        return age;
    }


    // show student info
    public void showInfo(){
        System.out.println("name : " + this.getName());
        System.out.println("age : " + this.getAge());
        System.out.println("address : " + this.getAddress());
        System.out.println("code : " + this.getCode());
    }
}
