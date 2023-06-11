package main.java.learn.theme.queuedemo;

public class Test1 {
    public static void main(String[] args) {
        ArrayToQueue queue = new ArrayToQueue(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        //查看队列大小
        System.out.println("size = " + queue.getQueueSize());

        //查看队首元素
        System.out.println("peek = " + queue.peek());

        //出队
        queue.poll();

        //查看队列大小
        System.out.println("size = " + queue.getQueueSize());

        //查看队首元素
        System.out.println("peek = " + queue.peek());

        System.out.println("继续添加元素");

        //添加元素到满
        queue.offer(1);
        queue.offer(1);
        queue.offer(1);
        //queue.offer(1);

        //查看队列大小
        System.out.println("size = " + queue.getQueueSize());

        //查看队首元素
        System.out.println("peek = " + queue.peek());

        //获取底层数组
        int[] arr = queue.toArray();

        for(int i : arr) {
            System.out.println(i + " ");
        }
    }
}
