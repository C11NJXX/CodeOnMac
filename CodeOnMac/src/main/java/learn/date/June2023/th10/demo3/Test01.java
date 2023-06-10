package main.java.learn.date.June2023.th10.demo3;

public class Test01 {
    public static void main(String[] args) {
        Thread t1 = new AddThread();
        Thread t2 = new SubtractThread();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println(Count.count);//每一次打印的结果都不同
    }
}

class Count {
    public static int count = 0;
}

class AddThread extends Thread {
    @Override
    public void run() {
        for(int i = 0 ;i < 10000 ; i++ ) {
            Count.count ++;
        }
    }
}

class SubtractThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i< 10000 ; i++) {
            Count.count--;
        }
    }
}
