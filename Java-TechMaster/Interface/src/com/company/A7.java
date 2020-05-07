package com.company;

import java.awt.print.Printable;

class A7 implements printable,Showable {
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}
