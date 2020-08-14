package com.company.module;

public class Person {
    private String fullName;
    private String name;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.fullName = name;
        splitName();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private void splitName(){
        String[] names = fullName.split(" ");
        name = "First name " + names[0] + "\n" + "last name : " + names[1];
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
