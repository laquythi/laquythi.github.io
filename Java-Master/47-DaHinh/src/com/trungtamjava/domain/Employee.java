package com.trungtamjava.domain;

public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void thongTin() {
        System.out.println("class con");
    }
}
