package com.company;

public class TestThread extends Thread{
    public int tong;

    public TestThread(){
        this.tong = 20200;
    }

    public synchronized void rutTien() throws InterruptedException{
        if(tong > 0){
            Thread.sleep(1000);
            tong = tong - 1000;
            System.out.println(tong);
        }else{
            System.out.println("tai khoan ko du so du");
        }
    }

    @Override
    public void run() {
        try {
            rutTien();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestThread t = new TestThread();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
