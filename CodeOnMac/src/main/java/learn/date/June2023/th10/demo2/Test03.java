package main.java.learn.date.June2023.th10.demo2;

public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Hi();
        t1.start();
        Thread.sleep(10);
        ((Hi) t1).running = false;
    }
}

class Hi extends Thread {
    public volatile boolean running = true;
    int n = 0;

    @Override
    public void run() {
        while (running) {
            n++;
            System.out.println(n + "times say Hi");
        }
        System.out.println("true - > false");
    }
}
