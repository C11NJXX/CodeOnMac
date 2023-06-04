package main.java.learn.date.June2023.th4.demo1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("Person",99);
        Student student = new Student(3);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);//无法实现向下转型
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Student);
        method1();
    }
    public static void method1() {
        Person person = new Student("1",1,1);
        if(person instanceof Student student) {
            System.out.println(student);
        }

    }
}
