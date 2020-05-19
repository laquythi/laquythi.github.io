package com.trungtamjava.dto;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        String fullName = p.setFullName("la quy"," thi");
        System.out.println(fullName);
    }
}
