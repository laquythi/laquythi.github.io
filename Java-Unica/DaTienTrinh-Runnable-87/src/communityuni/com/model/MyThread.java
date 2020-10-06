package communityuni.com.model;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" i = " + i);
                System.out.println("------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
