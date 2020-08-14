package com.company;

import com.company.module.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setName("thi la quy");
        System.out.println(person.getName());
        System.out.println(person.getFullName());
    }
}
