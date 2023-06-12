package main.java.learn.date.June2023.th12.demo3;

import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) {
        Method[] methods = String.class.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method.toString());
        }
    }
}
