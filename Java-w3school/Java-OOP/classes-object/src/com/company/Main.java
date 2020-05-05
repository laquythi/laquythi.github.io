//package com.company;
//
//public class Main {
//    String name = "la quy thi";
//    public static void main(String[] args) {
//        Main myObj1 = new Main();
//        Main myObj2 = new Main();
//        System.out.println(myObj1.name);
//        System.out.println(myObj2.name);
//    }
//}

//package com.company;
//
//public class Main{
//    public static void main(String[] args){
//        OtherClass otherClassObj = new OtherClass();
//        otherClassObj.printSomeThing();
//
//    }
//}


//  Java Class Attributes
//package com.company;
//class Main{
//    int x = 5;
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//    }
//}

//  Java modify Attributes
//package com.company;
//class Main{
//    String name = "thi la quy";
//    public static void main(String[] args){
//        Main newName = new Main();
//        newName.name = "la quy thi";
//        System.out.println(newName.name);
//    }
//}

//package com.company;
//public class Main{
//    int x = 1991;
//    public static void main(String[] args){
//        Main newValueX = new Main();
//        newValueX.x = 29;
//        System.out.println(newValueX.x);
//    }
//}

//  If you don't want the ability to override existing values, declare the attribute as final
//package com.company;
//public class Main{
//    final int x = 1991;
//    public static void main(String[] args){
//        Main newValueX = new Main();
//        newValueX.x = 29; //cannot change value x =29,because type of x is "final" int
//        System.out.println(newValueX.x); // => error
//    }
//}

//  Multiple Objects
//package com.company;
//public class Main{
//    String name = "memories Phamm";
//    public static void main(String[] args){
//        Main newValueX1 = new Main();
//        Main newValueX2 = new Main();
//        newValueX1.name = "Autumn Phamm";
//        newValueX2.name = "Thu Phamm";
//        System.out.println(newValueX1.name);
//        System.out.println(newValueX2.name);
//    }
//}

//  Multiple Attributes
//package com.company;
//public class Main{
//    String firstName = "thi";
//    String lastName = " la quy";
//    int age = 29;
//    public static void main(String[] args){
//        Main newObj = new Main();
//        System.out.println("Guy name is " + newObj.firstName + newObj.lastName + ".He is " + newObj.age + " year old");
//    }
//}

//  Java class Methods
//package com.company;
//public class Main{
//    static void firstMethod(){
//        System.out.println("first method on class Methods");
//    }
//    public static void main(String[] args){
//        firstMethod();
//    }
//}

//package com.company;
//public class Main{
//    static void myStaticMethod(){
//        System.out.println("static method can be called without creating object");
//    }
//    public void myPublicMethod(){
//        System.out.println("public method must be called by creating object");
//    }
//    public static void main(String[] args){
//        myStaticMethod();
//        Main newObj = new Main();
//        newObj.myPublicMethod();
//    }
//}

//  Access Methods With an Object
//package com.company;
//public class Main{
//    public void fullOption(){
//        System.out.println("your choice is full option");
//    }
//    public void yourPrice(int price){
//        System.out.println("your price is " + price);
//    }
//    public static void main(String[] args){
//        Main newObj = new Main();
//        newObj.fullOption();
//        newObj.yourPrice(200);
//    }
//}

//  Using Multiple Classes
//package com.company;
//public class Main{
//    public static void main(String[] args){
//        Car newObj = new Car();
//        newObj.fullOption();
//        newObj.maxSpeed(200);
//    }
//}

//  Java Constructors
//package com.company;
//public class Main{
//    String name;
//    public Main(){
//        name = "la quy thi";
//    }
//    public static void main(String[] args){
//        Main newObj = new Main();
//        System.out.println(newObj.name);
//    }
//}


//  OOP
//  Class/Objects
//package com.company;
//public class Main{
//    String name = "la quy thi";
//}

//  OOP Java Class Attributes
//  package com.company;
//public class Main{
//    final int x = 7;
//    int y = 9;
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println(myObj.x);
//        myObj.x = 17;
//        System.out.println(myObj.x);
//    }
//}

//package com.company;
//public class Main{
//    String fname = "thi";
//    String lname = "la quy";
//    int age = 29;
//    public static void main(String[] args){
//        Main myObj = new Main();
//        System.out.println("name:" + myObj.fname + " " + myObj.lname + " " + myObj.age );
//    }
//}

//  OOP Java Class Methods
//package com.company;
//public class Main{
//    static void myMethod(){
//        System.out.println("hello world");
//    }
//    public static void main(String[] args){
//        myMethod();
//    }
//}

//package com.company;
//public class Main{
//    // static method
//    static void myStaticMethod(){
//        System.out.println("Static methods can be called without creating objects");
//    }
//
//    // public method
//    public void myPublicMethod(){
//        System.out.println("Public methods must be called by creating objects");
//    }
//
//    // main method
//    public static void main(String[] args){
//        myStaticMethod();
//
//        Main newObj = new Main(); // Create an object of Main
//        newObj.myPublicMethod(); // Call the public method on the object
//    }
//}

//  Access Methods With an Object
// c1
//package com.company;
//public class Main{
//    static void fullThrottle(){
//        System.out.println("the car is going as fast as it can !");
//    }
//
//    public void maxSpeed(int maxSpeed){
//        System.out.println("max speed is " + maxSpeed);
//    }
//
//    public static void main(String[] args){
//        fullThrottle();
//        Main newCar = new Main();
//        newCar.maxSpeed(190);
//    }
//}

//c2
//package com.company;
//public class Main{
//    static void fullThrottle(){
//        System.out.println("the car is going as fast as it can !");
//    }
//
//    public void maxSpeed(int maxSpeed){
//        System.out.println("max speed is " +  maxSpeed);
//    }
//}

//  OOP Constructor
//package com.company;
//public class Main{
//    final String name ;
//
//    public Main(){
//        name = "la quy thi";
//    }
//
//    public static void main(String[] args){
//        Main newObj = new Main();
//        System.out.println(newObj.name);
//    }
//}

//package com.company;
//public class Main{
//    int x;
//
//    public Main(int y){
//        x = y;
//    }
//
//    public static void main(String[] args){
//        Main newObj = new Main(1991);
//        System.out.println(newObj.x);
//    }
//}

// many parameters
//package com.company;
//public class Main{
//    String name;
//    int age;
//    String address;
//
//    public Main(String fullName,int Age,String addressCountry){
//        name = fullName;
//        age = Age;
//        address = addressCountry;
//    }
//
//    public static void main(String[] args){
//        Main newGuy = new Main("la quy thi",29,"thai binh");
//        System.out.println("guy name is " + newGuy.name + ".he is " + newGuy.age + " year old," + " he come from " + newGuy.address);
//    }
//}

// OOP Java Modifiers

//  OOP Java Encapsulation ??????????
//package com.company;
//public class Main{
//    String name;
//    public static void main(String[] args){
//        Main newObj = new Main();
//        newObj.name = "thi la quy";
//        System.out.println(newObj.name);
//    }
//}

// OOP Java Packages
//  package from Java API
//package com.company;
//import java.util.Scanner;
//class Main{
//    public static void main(String[] args){
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("enter username");
//
//        String username = myObj.nextLine();
//        System.out.println("username is " + username);
//    }
//}

//  OOP Java Polymorphism
//package com.company;
//class Main{
//    public void maxSpeed(){
//        System.out.println("speed limit at : ");
//    }
//}
//class Mustang extends Main{
//    public void maxSpeed(){
//        System.out.println("320 km");
//    }
//}
//class Porches extends Main{
//    public void maxSpeed(){
//        System.out.println("280 km");
//    }
//}
//class myMainClass{
//    public static void main(String[] args){
//        Main newMustang = new Mustang();
//        Main newPorches = new Porches();
//        newMustang.maxSpeed();
//        newPorches.maxSpeed();
//    }
//}

package com.company;
class Main{
    public void maxSpeed(){
        System.out.println("speed limit is : ");
    }
}
class Mustang extends Main{
    public void maxSpeed(){
        System.out.println("320 km");
    }
}
class Porches extends Main{
    public void maxSpeed(){
        System.out.println("280km");
    }
}
class myMainClass{
    public static void main(String[] args){
        Main myMustang = new Mustang();
        Main myPorches = new Porches();
        myMustang.maxSpeed();
        myPorches.maxSpeed();
    }
}