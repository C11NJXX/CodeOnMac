package main.java.learn.theme.queuedemo;

public class Test {
    public static void main(String[] args) {
        LinkedListToQueue queue = new LinkedListToQueue();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("size = " + queue.getQueueSize());

        System.out.println("队首元素为" + queue.peek());

        queue.poll();

        //转换成数组
        int[] array = queue.toArray();
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
