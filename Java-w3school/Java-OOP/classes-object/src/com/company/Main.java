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

//  Java Constructor Parameters
package com.company;
public class Main{
    public static void main(String[] args){
        
    }
}