//package com.company;
//public class Main {
//    static void myMethod(){
//        System.out.println("content inside first Method");
//    }
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}

//      method parameters
//package com.company;
//public class Main{
//    static void myMethod(String name,int age){
//        System.out.println(name + " is " + age + " year old");
//    }
//    public static void main(String[] args){
//        myMethod("Trang",24);
//        myMethod("Nhung",20);
//    }
//}


//package com.company;
//public class Main{
//    static int myAge(int x){
//        return 2020 - x;
//    }
//    public static void main(String[] args){
//        System.out.println(myAge(1991));
//    }
//}

//package com.company;
//public class Main{
//    static int myMethod(int x,int y){
//        return x + y;
//    }
//    public static void main(String[] args){
//        System.out.println(myMethod(5,4));
//    }
//}

//      Method with if else
//package com.company;
//public class Main{
//    static void checkAge(int age){
//        if(age > 18){
//            System.out.println("you can married");
//        }else{
//            System.out.println("you can\'t married");
//        }
//    }
//    public static void main(String[] args){
//        checkAge(19);
//    }
//}

//      Java methods overloading

package com.company;
public class Main{
    static int plusMethod(int x,int y){
        return x + y;
    }
    static double plusMethodDouble(double x,double y){
        return x + y;
    }
    public static void main(String[] args){
        int sum1 = plusMethod(4,5);
        double sum2 = plusMethodDouble(5.4,7.6);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

