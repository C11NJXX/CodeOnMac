package main.java.learn.theme.dequedemo.demo2;

public class ArrayToDeque {

    //静态常量区------
    public static final int FRONT = 1;
    public static final int REAR = -1;
    //---------------
    private int front;//维护一个头指针

    private int[] arr;//底层维护一个数组

    private int dequeSize;//维护一个双向队列大小

    public ArrayToDeque(int capacity) {
        //生成一个容量为 capacity 的数组
        arr = new int[capacity];
        //初始化头指针与大小
        front = dequeSize = 0;
    }

    //获取容量
    public int getCapacity() {
        return arr.length;
    }

    //获取大小
    public int getDequeSize() {
        return dequeSize;
    }

    //判断是否为空
    public boolean isEmpty() {
        return getDequeSize() == 0;
    }

    //计算循环数组下标，考虑负数情况
    private int index(int index) {
        return ((index + getCapacity()) % (getCapacity()));
    }

    //入队(总)
    private void offer(int value, boolean isFront) {

        if(getDequeSize() == getCapacity()) {
            System.out.println("容量已满，无法添加数据");
            throw new IndexOutOfBoundsException();
        }else {
            if (isFront) {
                //从队首入队(将 front-1 交给 index 获取到下标）
                front = index(front - 1);
                arr[front] = value;

            } else {
                //从队尾入队(rear = front + capacity)
                int rear = index(front + getDequeSize());
                arr[rear] = value;

            }
            //更新大小
            dequeSize++;
        }
    }

    //从队首入队
    public void offerFirst(int value) {
        offer(value, true);
    }

    //从队尾入队
    public void offerRear(int value) {
        offer(value, false);
    }

    //出队（总）
    private void poll(boolean isFront) {
        if (isFront) {
            //从队首出队
            front = index(front + 1);
            //更新大小
            dequeSize--;
        } else {
            //从队尾出队
            //直接把 size 减 1，最后读取的时候读不到最后一位
            dequeSize--;
        }
    }

    /*从队首出队*/
    public void pollFirst() {
        poll(true);
    }

    /*从队尾出队*/
    public void pollRear() {
        poll(false);
    }

    //查看两端（总)
    private int peek(boolean isFront) {
        if (isFront) {
            //查看队首
            if (isEmpty()) {
                System.out.println("空队列不可访问队首！");
                throw new IndexOutOfBoundsException();
            } else {
                return arr[front];
            }
        } else {
            //查看队尾
            if (isEmpty()) {
                System.out.println("空队列不可访问队尾！");
                throw new IndexOutOfBoundsException();
            } else {
                return arr[index(front + getDequeSize() - 1)];
            }
        }
    }

    //查看队首
    public int peekFront() {
        return peek(true);
    }

    //查看队尾
    public int peekRear() {
        return peek(false);
    }

    //转换为数组，提供两种模式
    public int[] toArray(int model) {
        int[] arr = new int[getDequeSize()];
        if (model == FRONT) {
            int tmp = front;
            int index;
            for(int i = 0; i< arr.length ;i ++ ) {
                index = index(tmp);
                arr[i] = this.arr[index];
                tmp++;
            }
        } else if (model == REAR) {
            int tmp = front;
            int index;
            for(int i = 0; i < arr.length ; i++) {
                index = index(tmp + getDequeSize() -1);
                arr[i] = this.arr[index];
                tmp++;
            }
        }
        return arr;
    }
}
