package main.java.learn.date.June2023.th7.demo1;

public class Person {
    private String[] names;
    Person(String... names) {
        this.names = names;
    }

    public void showNames() {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
