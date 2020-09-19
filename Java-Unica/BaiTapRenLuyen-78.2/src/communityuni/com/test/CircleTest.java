package communityuni.com.test;

import communityuni.com.model.Circle;

import java.util.Scanner;

import static java.lang.StrictMath.floor;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("nhap vao ban kinh duong tron : ");

        circle.setRadius(7.9);
        System.out.println("ban kinh duong tron vua nhap la " + circle.getRadius());
        System.out.println("duong kinh cua duong tron la " + circle.getDiameter());
        System.out.println("chu vi cua duong tron la " + circle.getCircumference());
        System.out.println("dien tich cua duong tron la " + circle.getArea());
        System.out.println("dien tich cua duong tron sau khi lam tron la " + (double) Math.floor(circle.getArea()*1.0));

    }
}
