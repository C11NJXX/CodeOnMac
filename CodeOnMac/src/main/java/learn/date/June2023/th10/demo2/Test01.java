package main.java.learn.date.June2023.th10.demo2;

public class Test01 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new MyThread();
        t.start();
        Thread.sleep(50);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int n = 0;
        while(! isInterrupted()) {
            n++;
            System.out.println(n + " times t is running");
        }
    }
}
