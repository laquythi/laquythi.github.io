package communityuni.com.model;

public class ThreadStateDemo extends Thread {
    static Thread thread;

    public static void main(String[] args) {
        thread = new ThreadStateDemo();
        System.out.println("Thread thread is born.");
        System.out.println("Thread thread is ready");
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread thread is running...");
    }
}
