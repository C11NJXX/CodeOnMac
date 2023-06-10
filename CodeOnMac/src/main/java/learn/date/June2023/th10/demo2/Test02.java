package main.java.learn.date.June2023.th10.demo2;

public class Test02 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new MyRunnable());
        t.start();
        try{
            Thread.sleep(10);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        Thread hello = new Hello();
        hello.start();
        try {
            hello.join();
        }catch(InterruptedException e)
        {
            System.out.println("interrupted");
            e.printStackTrace();
        }
        hello.interrupt();
    }
}

class Hello extends Thread {
    @Override
    public void run() {
        int n = 0;
//        try{
//            while(!isInterrupted()) {
//                n++;
//                System.out.println(n + " times say hello");
//                Thread.sleep(1);
//            }
//        }catch(InterruptedException e) {
//            System.out.println("hello interrupted");
//            e.printStackTrace();
//            return;
//        }
        while(!isInterrupted()) {
            n++;
            System.out.println(n + " times say hello");
        }
        System.out.println("hello interrupted");
        return;
    }
}
