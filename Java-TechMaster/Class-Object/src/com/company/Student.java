 package com.company;
class Student extends Person{
    void message(){
        System.out.println("method in class Student");
    }
    void display(){
        message(); // goi method cua class hien tai (Student);
        super.message(); // goi method cua class parent (Person);
    }
}