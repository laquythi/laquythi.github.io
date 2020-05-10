package com.company;

public class Student {
    public String name;
    public String address;
    public int age;
    public String code;

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
    public int getAge(){
        return this.age;
    }
    public String getCode(){
        return this.code;
    }
}
