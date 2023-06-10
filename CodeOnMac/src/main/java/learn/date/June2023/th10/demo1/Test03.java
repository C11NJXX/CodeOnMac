package main.java.learn.date.June2023.th10.demo1;

public class Test03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("this is a thread");
        });
        System.out.println("main start");
        t.start();
        t.join();//利用 join 可以使得 main 线程在 t 线程结束后再执行
        System.out.println("main end");

    }
}
