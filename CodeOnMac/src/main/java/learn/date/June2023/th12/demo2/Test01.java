package main.java.learn.date.June2023.th12.demo2;

import java.lang.reflect.Field;

public class Test01 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stuClass = Student.class;
        //getFiled可以获取本类包括父类的 public 属性的信息
        System.out.println(stuClass.getField("id"));
        System.out.println(stuClass.getField("age"));
        //getDeclaredFiled可以获取本类的所有属性
        System.out.println(stuClass.getDeclaredField("name") + "\n" + "---------------");

        //获取本类包括父类的所有 public 字段
        Field[] fields = stuClass.getFields();
        //获取本类所有字段
        Field[] declaredFields = stuClass.getDeclaredFields();

        for(Field f : fields) {
            System.out.println(f.toString());
        }
        System.out.println("--------------");
        for(Field f : declaredFields) {
            System.out.println(f.toString());
        }


    }
}

class Student extends Person{
    public int id;
    private String name;
}
class Person {
    public int age;
}
