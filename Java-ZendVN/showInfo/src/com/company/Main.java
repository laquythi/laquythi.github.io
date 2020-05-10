package com.company;

public class Main {
    public static void main(String[] args) {

        // hien dang FAIL
        Student newObj = new Student();

        // student 1
        newObj.setName("memories phamm");
//        newObj.setAge(28);
        newObj.setAddress("quang ninh");
        newObj.setCode("hello world !");

        // showInfo method
        newObj.showInfo();

        // getAge method
        newObj.getAge();
    }
}
