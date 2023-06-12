package main.java.learn.theme.annotationdemo.demo2;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        //查看 p 的 class Person 是否使用了 Report 注解
        System.out.println(p.getClass().isAnnotationPresent(Report.class));

        //两种方法获取注解
        //1.判断是否使用了注解
        if(p.getClass().isAnnotationPresent(Report.class)) {
            //存在，直接获取
            Report annotation = p.getClass().getAnnotation(Report.class);
        }else {
            System.out.println("no annotation");
        }

        //2.直接获取，如果没有返回 null
    }
}
