package main.java.learn.date.June2023.th4.demo1;

public class Student extends Person{
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
