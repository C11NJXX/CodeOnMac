package main.java.learn.theme.genericsdemo.demo2;

public class Pair<T,K> {
    private T value1;
    private K value2;

    public Pair() {
    }

    public Pair(T value1, K value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * 获取
     * @return value1
     */
    public T getValue1() {
        return value1;
    }

    /**
     * 设置
     * @param value1
     */
    public void setValue1(T value1) {
        this.value1 = value1;
    }

    /**
     * 获取
     * @return value2
     */
    public K getValue2() {
        return value2;
    }

    /**
     * 设置
     * @param value2
     */
    public void setValue2(K value2) {
        this.value2 = value2;
    }

    public String toString() {
        return "Pair{value1 = " + value1 + ", value2 = " + value2 + "}";
    }

    public static<S,G> void printPair(Pair<S,G> pair) {
        System.out.println(pair.toString());
    }
}
