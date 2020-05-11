package com.company;

public class TestPerson{
    public static void main(String[] args){
        Person person = new Person();

        person.setName("la quy thi");
        person.setCmnd("151987987");

        System.out.println("Name : " + person.getName() + " , CMND : " + person.getCmnd());
    }
}