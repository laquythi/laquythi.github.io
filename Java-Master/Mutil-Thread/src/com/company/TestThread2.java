package com.company;

public class TestThread2 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2();
        t1.setName("Thread1");

        TestThread2 t2 = new TestThread2();
        t2.setName("Thread2");

        TestThread2 t3 = new TestThread2();
        t3.setName("Thread3");

        t1.start();
        try {
            t1.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
