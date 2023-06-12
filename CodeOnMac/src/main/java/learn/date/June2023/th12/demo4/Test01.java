package main.java.learn.date.June2023.th12.demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = Integer.class.getConstructors();
        Constructor constructor1 = Integer.class.getConstructor(int.class);
        Integer i = (Integer) constructor1.newInstance(3);
        System.out.println(i);

        Constructor constructor2 = Integer.class.getConstructor(String.class);
        Integer j = (Integer) constructor2.newInstance("6");
        System.out.println(j);
    }
}
