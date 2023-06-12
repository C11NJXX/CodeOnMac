package main.java.learn.date.June2023.th12.demo1;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = String.class;
        System.out.println(cls.toString());
        String s = "abc";
        Class cls1 = s.getClass();
        System.out.println(cls1.toString());
        Class cls2 = Class.forName("java.lang.String");
        System.out.println(cls2.toString());
        System.out.println(cls == cls1);

        Integer i = Integer.valueOf(1);

    }
}
