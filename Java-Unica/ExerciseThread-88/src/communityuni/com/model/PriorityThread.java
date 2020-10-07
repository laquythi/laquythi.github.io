package communityuni.com.model;

public class PriorityThread extends Thread {

    // constructor
    public PriorityThread(String name,int priority) {
        setName(name);
        setPriority(priority);
        start();
    }

    @Override
    public void run() {
        System.out.println("name = " + getName() + "-" + "priority = " + getPriority());
    }

    public static void main(String[] args) throws InterruptedException {
        PriorityThread priorityThread1 = new PriorityThread("Thread 01 = ",Thread.MIN_PRIORITY);
        PriorityThread priorityThread2 = new PriorityThread("Thread 02",Thread.NORM_PRIORITY);
        PriorityThread priorityThread3 = new PriorityThread("Thread 03",Thread.MAX_PRIORITY);

        priorityThread1.join();
        priorityThread2.join();
        priorityThread3.join();
    }
}
