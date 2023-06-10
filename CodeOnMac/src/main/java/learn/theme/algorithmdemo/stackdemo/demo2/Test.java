package main.java.learn.theme.algorithmdemo.stackdemo.demo2;

public class Test {
    public static void main(String[] args) {
        LinkedListToStack ls = new LinkedListToStack();
        ls.push(3);
        ls.push(4);
//        System.out.println(ls.peek());
//        ls.pop();
//        System.out.println(ls.peek());
//        ls.pop();
//        System.out.println(ls.peek());
       for(int i : ls.toArray(LinkedListToStack.BOTTLE)) {
           System.out.println(i + " ");
       }
       for (int i :ls.toArray(LinkedListToStack.TOP)) {
           System.out.println(i + " ");
       }
    }
}
