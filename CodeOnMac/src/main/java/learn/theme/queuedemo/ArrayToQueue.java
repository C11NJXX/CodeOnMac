package main.java.learn.theme.queuedemo;

public class ArrayToQueue {
    private int[] arr;
    private int front;//内部头指针维护

    private int rear;//内部尾指针维护

    private int queueSize;//队列实际大小

    public ArrayToQueue(int capacity) {
        //初始化头指针与实际大小
        front = queueSize = 0;
        //创建 capacity 大小的数组
        arr = new int[capacity];
    }

    //返回实际队列大小
    public int getQueueSize() {
        return queueSize;
    }

    //判断是否为空
    public boolean isEmpty() {
        return queueSize == 0;
    }

    //入队

    public void offer(int value) {
        //判断是否已经满元素了
        if (getQueueSize() == arr.length) {
            System.out.println("数组已满，请重新创建容量更大的队列");
            throw new IndexOutOfBoundsException();
        } else {
            //在队尾添加元素,rear = front + queueSize
            rear = (front + queueSize)%arr.length;//利用取余使得数组可以循环，前提是不能超量
            arr[rear] = value;
            //更新大小
            queueSize++;
        }
    }

    //出队
    public void poll() {
        //判断是否有元素
        if(isEmpty()) {
            System.out.println("没有元素可以删除");
            throw new IndexOutOfBoundsException();
        }else {
            //更新头指针
            front++;
            //更新大小
            queueSize--;
        }
    }

    //查看队首元素
    public int peek() {
        if(isEmpty()) {
            System.out.println("队列为空");
            throw new IndexOutOfBoundsException();
        }else {
            return arr[front];
        }
    }

    //获取 int[]数组

    public int[] toArray() {
        //对外要展现出队列特点，直接返回底层数组会有问题（循环数组导致的）
        int[] tmp = new int[queueSize];
        for(int i = 0 ; i< queueSize ; i++ ) {
            tmp[i] = arr[(front)%arr.length];
            front++;
        }
        return tmp;
    }


}
