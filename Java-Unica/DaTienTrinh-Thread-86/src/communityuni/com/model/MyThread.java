package communityuni.com.model;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":i = " + i);
                System.out.println("---------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
