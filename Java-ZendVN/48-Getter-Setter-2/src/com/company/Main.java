package com.company;

public class Main {

    public static void main(String[] args) {
	// setter & getter
        Student studentOne = new Student();
        Student studentTwo = new Student();

        // studentOne
        studentOne.setBirthday(1991);
        studentOne.setName("John");
        studentOne.setCode("Java");
        studentOne.showInfo();
        int age = studentOne.getAge();
        System.out.println("Age = " + age);

        // studentTwo
        studentTwo.setBirthday(1990);
        studentTwo.setName("Peter");
        studentTwo.setCode("S002");
        studentTwo.showInfo();
        int age2 = studentTwo.getAge();
        System.out.println("Age = " + age2 );
    }
}
