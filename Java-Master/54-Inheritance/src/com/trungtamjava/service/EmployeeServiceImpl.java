package com.trungtamjava.service;

public class EmployeeServiceImpl implements EmployeeService,AnimalService {
    @Override
    public void luong() {
        System.out.println("luong");
    }

    @Override
    public void them() {

    }

    @Override
    public void sua() {

    }

    @Override
    public void xoa() {

    }

    public static void main(String[] args){
        EmployeeService emp = new EmployeeServiceImpl();

        AnimalService p = new EmployeeServiceImpl();

        emp.luong();
    }
}
