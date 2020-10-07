package communityuni.com.model;

import java.util.Random;

public class ThreadPriority extends Thread {
    int num;

    // constructor
    public ThreadPriority(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println("Count = " + i);
        }
        System.out.println(currentThread().getName());
        System.out.println("Priority = " + getPriority());
    }

    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 0; i <= 2; i++) {
            ThreadPriority threadPriority = new ThreadPriority(rd.nextInt(5) + 1);
            threadPriority.setPriority(rd.nextInt(10) + 1);
            threadPriority.setName("ct" + i);
            threadPriority.start();
        }
    }
}
