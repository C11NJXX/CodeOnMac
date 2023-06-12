package main.java.learn.theme.genericsdemo.demo1;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

//测试一个可以按照分数排列的 Person
//顺便复习一下注解，分数要求检查 在 0-100 以内
public class Test01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(98, 1));
        personList.add(new Person(68, 2));
        personList.add(new Person(101, 3));

        personList.sort(null);
        for (Person person : personList) {
            System.out.println(person.toString());
        }

        for (Person person : personList) {
            System.out.println("checking");
            check(person);
        }
    }

    public static void check(Person p) throws NoSuchFieldException, IllegalAccessException {
        //获取字段(注意要使用 declared 来获取private 字段)
        Field score = p.getClass().getDeclaredField("score");
        //获取字段注解
        Range annotation = score.getAnnotation(Range.class);
        if (annotation != null) {
            //获取字段值
            score.setAccessible(true);
            Object o = score.get(p);
            if (o instanceof Integer s) {
                //判断分数合理性
                if (s < annotation.min() || s > annotation.max()) {
                    throw new IllegalArgumentException("不合理的数值" + score.getName());
                }
            }
        }
    }
}
class Person implements Comparable<Person> {
    @Range(min = 0, max = 100)
    private int score;
    private int id;

    public Person(int score, int id) {
        this.score = score;
        this.id = id;
    }

    @Override
    public int compareTo(Person other) {
        if (this.score == other.score) {
            return 0;
        } else if (this.score < other.score) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return new String("id = " + id + "score = " + score);
    }
}
