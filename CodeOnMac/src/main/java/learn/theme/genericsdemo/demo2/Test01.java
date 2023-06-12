package main.java.learn.theme.genericsdemo.demo2;

public class Test01 {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>();
        pair.setValue1(3);
        pair.setValue2("hi");
        Pair.printPair(pair);
    }
}
