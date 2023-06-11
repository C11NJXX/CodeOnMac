package main.java.learn.theme.queuedemo;

import main.java.learn.theme.stackdemo.demo2.ListNode;

public class LinkedListToQueue {
    private ListNode front;//头节点
    private ListNode rear;//尾节点

    private int queueSize;//队列长度

    public LinkedListToQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }
    //获取队列长度
    public int getQueueSize() {
        return queueSize;
    }

    //判断是否为空
    public boolean isEmpty() {
        return queueSize == 0;
    }

    //入队操作
    public void offer(int value) {
        //判断是否有数据，如果没有，则将节点同时作为首尾
        if(isEmpty()) {
            ListNode ln = new ListNode(value);
            front = ln;
            rear = ln;
            //更新大小
            queueSize++;
        }else {
            //在尾节点后面添加数据
            ListNode ln = new ListNode(value);
            rear.next = ln;
            rear = ln;
            //更新 size
            queueSize++;
        }
    }

    //查看队首
    public int peek() {
        if(isEmpty()) {
            System.out.println("没有数据在队列中");
            throw new IndexOutOfBoundsException();
        }else {
            return front.value;
        }
    }

    //出队列
    public void poll() {
        if (isEmpty()) {
            System.out.println("没有数据在队列中");
        }else {
            //删除头节点，并指定新的头节点(其实不用删除，直接改指向就行）
            front = front.next;
            //更新 size
            queueSize--;
        }
    }

    //转换成数组形式
    public int[] toArray() {
        int[] tmp = new int[queueSize];
        //创建临时引用(从队首访问）
        ListNode listNode = front;
        for(int i = 0 ; i< tmp.length ; i++ ) {
            tmp[i] = front.value;
            front
                    = front.next;
        }
        return tmp;
    }
}
