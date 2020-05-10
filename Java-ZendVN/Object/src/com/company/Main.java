package com.company;

public class Main {

    public static void main(String[] args) {
	// Object,khoi tao doi tuong cua class
        Student studentOne = new Student();
        Teacher teacherOne = new Teacher();
        System.out.println(teacherOne.name + " " +  teacherOne.address);
        teacherOne.sleep();

        // tao moi 1 object dau tien tu class Student
        Student newObj = new Student();
        newObj.name = "memories phamm";
        newObj.Age = 28;
        newObj.job = "web developer";
        System.out.println("her name is " + newObj.name + ".she is " + newObj.Age + ". she is a " + newObj.job);

        // tao object thu 2 tu class Student
        Student newObj2 = new Student();
        newObj2.name = "tran thuy";
        newObj2.Age = 27;
        newObj2.job = "Banker";
        System.out.println("her name is " + newObj2.name + ".She is a " + newObj2.job + ".she is " + newObj2.Age + " year old.");
    }
}
