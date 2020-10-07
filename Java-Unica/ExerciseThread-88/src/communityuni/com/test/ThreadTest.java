package communityuni.com.test;

public class ThreadTest implements Runnable {
    Thread objectThread;

    // constructor
    public ThreadTest(Thread objectThread) {
        System.out.println(Thread.currentThread().getName());
        objectThread = new Thread(this);
        System.out.println("Thread objectThread is alive = " + objectThread.isAlive());
        objectThread.setName("new Thread");
        objectThread.start();
    }

    public ThreadTest() {

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println("Thread objectThread is alive = " + objectThread.isAlive());
    }

    public static void main(String[] args) {
        new ThreadTest();
    }
}
