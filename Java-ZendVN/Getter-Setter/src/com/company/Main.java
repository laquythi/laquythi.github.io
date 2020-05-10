package com.company;

public class Main {
    public static void main(String[] args) {
        Student newObj = new Student();
        newObj.setName("memories phamm");
        newObj.setAge(28);
        newObj.setAddress("quang ninh");
        newObj.setCode("hello world !");

        System.out.println("name : " + newObj.getName());
        System.out.println("age : " + newObj.getAge());
        System.out.println("address : " + newObj.getAddress());
        System.out.println("code : " + newObj.getCode());
    }
}
