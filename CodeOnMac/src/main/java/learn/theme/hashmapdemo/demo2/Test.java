package main.java.learn.theme.hashmapdemo.demo2;

public class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(11032,"a");
        myHashMap.put(11033,"b");
        myHashMap.put(11034,"c");
        myHashMap.put(11035,"d");
        myHashMap.put(11036,"e");
        //查询
        System.out.println(myHashMap.get(11032));
    }
}
