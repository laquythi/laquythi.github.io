package com.trungtamjava.dto;

public class Person {
    private String firstName;
    private String lastName;

    public String setFullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        return firstName + lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}


