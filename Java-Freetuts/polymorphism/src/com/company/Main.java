package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.show(); //phuong thuc show cua lop Shape

        shape = new Rectangle();
        shape.show(); // phuong thuc show cua lop Rectangle

        shape = new Square();
        shape.show(); // phuong thuc show cua lop Square;
    }
}
