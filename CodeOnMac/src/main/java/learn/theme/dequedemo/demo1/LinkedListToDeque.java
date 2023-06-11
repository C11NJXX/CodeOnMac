package main.java.learn.theme.dequedemo.demo1;

public class LinkedListToDeque {

    //静态常量区
    public static final int FRONT = 1;
    public static final int REAR = -1;
    //-----------
    private ListNodePlus front;//头节点
    private ListNodePlus rear;//尾节点

    private int dequeSize;//维护大小

    public LinkedListToDeque() {
        //初始化头尾节点
        front = rear = null;
        //初始化大小
        dequeSize = 0;
    }

    //获取大小
    public int getDequeSize() {
        return dequeSize;
    }

    //判断是否为空
    public boolean isEmpty() {
        return dequeSize == 0;
    }

    //入队（总）
    private void offer(int value, boolean isFront) {
        //创建新节点
        ListNodePlus lnp = new ListNodePlus(value);
        //如果为空，另新节点为头尾节点
        if (isEmpty()) {
            front = rear = lnp;
            //更新大小
            dequeSize++;
        } else {
            if (isFront) {
                //从头节点插入
                front.prev = lnp;
                lnp.next = front;
                //更新头节点
                front = lnp;
            } else {
                //从尾节点插入
                rear.next = lnp;
                lnp.prev = rear;
                //更新尾节点
                rear = lnp;
            }
            //统一更新大小
            dequeSize++;
        }
    }

    //从头节点插入
    public void offerFirst(int value) {
        offer(value, true);
    }

    //从尾节点插入
    public void offerRear(int value) {
        offer(value, false);
    }

    //删除节点（总）
    private void poll(boolean isFront) {
        ListNodePlus tmp;
        if (isFront) {
            //删除头节点
            //---------//
            //创建临时节点引用
            tmp = front.next;
            //利用临时节点删除与头节点的连接
            tmp.prev = null;
            //利用头节点删除与临时节点的连接
            front.next = null;
            //更新头节点
            front = tmp;
            //更新大小
        } else {
            //删除尾节点
            //--------//
            //创建临时节点引用
            tmp = rear.prev;
            //利用临时节点删除与尾节点的连接
            tmp.next = null;
            //利用尾节点删除与临时节点的连接
            rear.prev = null;
            //更新尾节点
            rear = tmp;
            //更新大小
        }
        dequeSize--;
    }

    // 删除头节点
    public void pollFront() {
        poll(true);
    }

    //删除尾节点
    public void pollRear() {
        poll(false);
    }

    //获取头尾节点
    private int peek(boolean isFront) {
        if (isFront) {
            //获取头节点
            if (isEmpty()) {
                System.out.println("空队列无法获取队首");
                throw new IndexOutOfBoundsException();
            } else {
                return front.value;
            }
        } else {
            //获取尾节点
            if (isEmpty()) {
                System.out.println("空队列无法获取队尾");
                throw new IndexOutOfBoundsException();
            } else {
                return rear.value;
            }
        }
    }

    //获取头节点
    public int peekFront() {
        return peek(true);
    }

    //获取尾节点
    public int peekRear() {
        return peek(false);
    }

    //转换成数组
    public int[] toArray(int model) {
        int[] arr = new int[dequeSize];
        if(model == FRONT){
            //从队首开始
            //--------//
            //创建临时引用
            ListNodePlus tmp = front;
            for(int i = 0; i< arr.length;i++) {
                arr[i] = tmp.value;
                tmp = tmp.next;
            }
        }else if(model == REAR) {
            //从队尾开始
            //--------//
            //创建临时引用
            ListNodePlus tmp = rear;
            for(int i = 0;i< arr.length;i++) {
                arr[i] = tmp.value;
                tmp = tmp.prev;
            }
        }
        return arr;
    }
}
