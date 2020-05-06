package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
//        Cat firstCat = new Cat();
//        Dog firstDog = new Dog();
//        Dog.sleep();
//        System.out.println(firstCat.age);
//
//        Mark ceo = new Mark();
//        ceo.stayAtHome();
//        ceo.name = "Just Mark";
//        System.out.println(ceo.name);
//        Thiel.Job();
//        Thiel founder = new Thiel();
//        founder.did();

//        Cat newCat = new Cat();
//        System.out.println(newCat);
//
//        Mark introduce = new Mark();
//        System.out.println(introduce);

        //Tham chiếu trực tiếp đến biến instance của lớp cha.
//        Bike2 newBike = new Bike2();
//        newBike.display(); // global vehicle
//        System.out.println(newBike.speed); //100;
//        Vehicle newVehicle = new Vehicle();
//        System.out.println(newVehicle.speed); // 50;

        // Gọi trực tiếp Constructor của lớp cha
//        Bike2 newBike = new Bike2();

        // Gọi trực tiếp phương thức của lớp cha
        Student newStudent = new Student();
        newStudent.display();
    }
}