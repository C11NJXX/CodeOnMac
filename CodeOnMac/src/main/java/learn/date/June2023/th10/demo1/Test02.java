package main.java.learn.date.June2023.th10.demo1;

public class Test02 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.run();//虽然打印了，但是没有启动新的t 线程，仍然是在 main 主线程中执行的
        t.start();
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Thread t2 = new Thread(
                () -> {
                    System.out.println("lam");
                }
        );
        t2.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("this is my runnable");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("this is my thread");
    }
}

