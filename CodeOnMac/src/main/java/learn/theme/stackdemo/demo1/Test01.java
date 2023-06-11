package main.java.learn.theme.stackdemo.demo1;

import java.util.Stack;

public class Test01 {
    public static void main(String[] args) {
        //创建 Stack 实例
        Stack<Integer> integerStack = new Stack<>();
        //准备一些 Integer 实例
        Integer integer1 = Integer.valueOf(3);
        Integer integer2 = Integer.valueOf(4);
        Integer integer3 = Integer.valueOf(5);
        Integer integer4 = Integer.valueOf(6);
        Integer integer5 = Integer.valueOf(7);
        //依次入栈
        integerStack.push(integer1);
        integerStack.push(integer2);
        integerStack.push(integer3);
        integerStack.push(integer4);
        integerStack.push(integer5);

        System.out.println(integerStack.peek());
        integerStack.pop();
        System.out.println(integerStack.peek());
        System.out.println(integerStack.size());
        System.out.println(integerStack.isEmpty());
    }
}
