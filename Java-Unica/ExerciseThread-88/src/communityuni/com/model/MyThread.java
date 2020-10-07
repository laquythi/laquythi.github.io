package communityuni.com.model;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("the main thread");
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("the child thread");
                sleep(1000);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
