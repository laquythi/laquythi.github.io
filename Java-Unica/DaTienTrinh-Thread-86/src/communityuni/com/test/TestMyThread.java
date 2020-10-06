package communityuni.com.test;

import communityuni.com.model.MyThread;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();

        MyThread thread3 = new MyThread();
        thread3.start();
    }
}
