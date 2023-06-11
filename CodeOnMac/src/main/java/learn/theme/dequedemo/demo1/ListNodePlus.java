package main.java.learn.theme.dequedemo.demo1;

public class ListNodePlus{
    public int value;
    //维护一个前驱节点
    public ListNodePlus prev;
    //维护一个后驱节点
    public ListNodePlus next;
    public ListNodePlus(int value) {
        this.value = value;
        next = prev = null;
    }



}
