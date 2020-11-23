package communityuni.com.test;

import communityuni.com.model.Circle;
import communityuni.com.model.Point;

import java.util.Scanner;

import static java.lang.StrictMath.floor;

public class CircleTest {
    public static void main(String[] args) {
        // cach 1 :
//        Circle circle = new Circle();
//        System.out.println("nhap vao ban kinh duong tron : ");
//
//        circle.setRadius(7.9);
//        System.out.println("ban kinh duong tron vua nhap la " + circle.getRadius());
//        System.out.println("duong kinh cua duong tron la " + circle.getDiameter());
//        System.out.println("chu vi cua duong tron la " + circle.getCircumference());
//        System.out.println("dien tich cua duong tron la " + circle.getArea());
//        System.out.println("dien tich cua duong tron sau khi lam tron la " + (double) Math.floor(circle.getArea()*1.0));


        // cach 2 :
        Scanner sc = new Scanner(System.in);
        Circle circle;
        System.out.println("nhap vao ban kinh duong tron");
        double radius = sc.nextDouble();

        System.out.println("nhap toa do X : ");
        int x = sc.nextInt();

        System.out.println("nhap toa to Y : ");
        int y = sc.nextInt();

        circle = new Circle(x,y,radius);

        System.out.println("ban kinh duong tron vua nhap la " + circle.getRadius());

        System.out.println("chu vi duong tron la " + Math.floor(circle.getCircumference()*100)/100 );

        System.out.println("dien tich duong tron la " + Math.floor(circle.getArea()*100)/100);

        System.out.println("-----------------\nthong so cua duong tron la \n" + circle);

        // cach 3 :
//        Point point;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao ban kinh duong tron ");
//        double radius = sc.nextDouble();

//        System.out.println("nhap vao toa do x : ");
//        int x = sc.nextInt();
        
//        System.out.println("nhap vao toa do y : ");
//        int y = sc.nextInt();
//
//        if(radius <= 0){
//            System.out.println("ban nhap sai thong tin,radius phai > 0");
//        }else{
//            System.out.println("ban kinh vua nhap la " + radius);
//            point = new Circle(x,y,radius);
//            System.out.println("chu vi duong tron la " + Math.floor(point.getCircumference()*100)/100 );
//
//            System.out.println("dien tich duong tron la " + Math.floor(point.getArea()*100)/100);
//
//            System.out.println("thong so duong tron la \n" + point);
        }
    }
