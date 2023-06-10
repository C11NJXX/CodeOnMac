package main.java.learn.date.June2023.th10.demo1;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("main strat");
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("t start");
                try {
                    Thread.sleep(10);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t end");
            }
        };
        t.start();
        try{
            Thread.sleep(20);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end");
    }

}
