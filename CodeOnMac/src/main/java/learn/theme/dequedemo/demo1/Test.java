package main.java.learn.theme.dequedemo.demo1;

public class Test {
    public static void main(String[] args) {
        LinkedListToDeque deque = new LinkedListToDeque();
        //添加数据(从头）
        System.out.println("从头添加数据");
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerFirst(4);
        deque.offerFirst(5);
        deque.offerFirst(6);
        //测试
        showInfo(deque);

        //添加数据（队尾）
        System.out.println("从队尾添加数据");
        deque.offerRear(1);
        deque.offerRear(2);
        deque.offerRear(3);
        deque.offerRear(4);
        deque.offerRear(5);
        deque.offerRear(6);
        //测试
        showInfo(deque);

        //删除队首队尾数据
        deque.pollFront();
        deque.pollRear();
        showInfo(deque);

    }

    private static void showInfo(LinkedListToDeque deque) {
        //测试
        System.out.println("打印当前队列");
        for(int i : deque.toArray(LinkedListToDeque.FRONT)){
            System.out.println(i + " ");
        }
        //测试，打印队首和队尾
        System.out.println("当前队首: " + deque.peekFront());
        System.out.println("当前队尾: " + deque.peekRear());
    }
}
