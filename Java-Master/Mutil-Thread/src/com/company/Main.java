package com.company;

public class Main {

    public static void main(String[] args) {
	// Mutil thread
        MyThread1 my1 = new MyThread1();
        Thread t = new Thread(my1);

        MyThread2 my2  = new MyThread2();

        t.start();
        my2.start();
    }
}
