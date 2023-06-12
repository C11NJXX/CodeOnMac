package main.java.learn.date.June2023.th12.demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Integer> integerClass = Integer.class;
        Constructor<Integer> constructor = integerClass.getConstructor(int.class);
        Integer integer = constructor.newInstance(3);
        System.out.println(integer.getClass().isAssignableFrom(Integer.class));
        System.out.println(integer.getClass().isAssignableFrom(Number.class));

    }
}
