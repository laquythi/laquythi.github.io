package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        try {
//            int x = 5;
//            int y = 0;
//            int z = x/y;
//            System.out.println("z = " + z);
//            System.out.println("cam on");
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        finally {
//            System.out.println("error but programming still run");
//        }

        try {
            int x = 5;
            int y = 0;
            int z = x / y;
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex);
        }finally {
            System.out.println("error but programming stil run");
        }
    }
}
