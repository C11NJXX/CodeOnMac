package main.java.learn.theme.dequedemo.demo2;

public class Test {
    public static void main(String[] args) {
        ArrayToDeque deque = new ArrayToDeque(10);
        //从队尾添加数据
        deque.offerRear(1);
        deque.offerRear(2);
        deque.offerRear(3);
        deque.offerRear(4);
        deque.offerRear(5);
        showInfo(deque);
        //从队首添加数据
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerFirst(4);
        deque.offerFirst(5);
        showInfo(deque);
        //检测是否可以正常处理越界问题ok
//        try{
//            deque.offerFirst(0);
//        }catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
//        }


    }
    public static void showInfo(ArrayToDeque deque) {
        //转化为数组（FRONT)
        int[] arr = deque.toArray(ArrayToDeque.FRONT);
        System.out.println("打印当前队列");
        for(int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println("当前队首" + deque.peekFront());
        System.out.println("当前队尾" + deque.peekRear());
    }
}
