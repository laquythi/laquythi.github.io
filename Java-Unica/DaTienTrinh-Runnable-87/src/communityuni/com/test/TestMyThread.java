package communityuni.com.test;

import communityuni.com.model.MyThread;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread run1 = new MyThread();
        MyThread run2 = new MyThread();
        MyThread run3 = new MyThread();

        Thread thread1 = new Thread(run1);
        thread1.setName("tien trinh A");

        Thread thread2 = new Thread(run2);
        thread2.setName("tien trinh B");

        Thread thread3 = new Thread(run3);
        thread3.setName("tien trinh C");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
