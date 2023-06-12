package main.java.learn.date.June2023.th12.demo5;

public class Test02 {
    public static void main(String[] args) {
        //查看 Integer 实现了哪些接口
        Class integerClass = Integer.class;
        Class[] interfaces = integerClass.getInterfaces();
        for(Class in : interfaces) {
            System.out.println(in);
            Class[] superInterfaces = in.getInterfaces();
            for(Class superInterface : superInterfaces) {
                System.out.println(superInterface);
            }
        }
        Class superclass = integerClass.getSuperclass();
        Class[] interfaces1 = superclass.getInterfaces();
        for(Class in : interfaces1 ) {
            System.out.println(in);
        }
    }
}
