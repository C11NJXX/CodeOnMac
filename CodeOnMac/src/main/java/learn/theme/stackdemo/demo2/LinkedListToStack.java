package main.java.learn.theme.stackdemo.demo2;

public class LinkedListToStack {
    private ListNode stackPeek;
    private int stackSize;

    public static final int TOP = 1;
    public static final int BOTTLE = 2;


    LinkedListToStack() {
        stackPeek = null;
        stackSize = 0;
    }

    public boolean IsEmpty() {
        if (this.stackSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    //根据示意图编写代码，注意方向以及 peek 的方位
    public void push(int value) {
        //创建新节点
        ListNode ln = new ListNode(value);
        ln.next = stackPeek;
        //新节点成为栈顶
        stackPeek = ln;
        //更新大小
        stackSize++;
    }

    public void pop() {
        //判断栈是否为空
        if (IsEmpty()) {
            System.out.println("栈为空");
            throw new RuntimeException();
        } else {
            //更新头节点
            stackPeek = stackPeek.next;
            //更新大小
            stackSize--;
        }
    }

    public int peek() {
        if (stackSize == 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return stackPeek.value;
        }
    }

    public int[] toArray(int model) {
        int[] tmp = new int[stackSize];
        if (model == BOTTLE) {
            //创建一个头节点引用用于遍历
            ListNode ls_iterator = stackPeek;
            for (int i = tmp.length - 1; i >= 0; i--) {
                tmp[i] = ls_iterator.value;
                ls_iterator = ls_iterator.next;
            }
        } else if (model == TOP) {
            //创建一个头节点引用用于遍历
            ListNode ls_iterator = stackPeek;
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = ls_iterator.value;
                ls_iterator = ls_iterator.next;
            }
        }
        return tmp;
    }
}
