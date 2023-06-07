package main.java.learn.date.June2023.th7.demo2;

public class Test3 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        animal.swim();

        new Animal() {
            @Override
            public void swim() {
                System.out.println("swim1");
            }
        }.swim();
    }
}
