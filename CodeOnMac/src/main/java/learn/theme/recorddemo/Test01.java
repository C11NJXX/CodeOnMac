package main.java.learn.theme.recorddemo;

public class Test01 {
    public static void main(String[] args) {
        Point p = Point.of(3,3);
        System.out.println(p.toString());
    }
    public record Point(int x,int y) {
        public static Point of() {
            return new Point(0,0);
        }
        public static  Point of(int x,int y) {
            if(x < 0||y<0) {
                throw new IllegalArgumentException();
            }else{
                return new Point(x,y);
            }

        }
    }
    /**
     * 相当于下面的代码（用一行就解决了）
     * final class Point extends Record {
     *     private final int x;
     *     private final int y;
     *
     *     public Point(int x, int y) {
     *         this.x = x;
     *         this.y = y;
     *     }
     *
     *     public int x() {
     *         return this.x;
     *     }
     *
     *     public int y() {
     *         return this.y;
     *     }
     *
     *     public String toString() {
     *         return String.format("Point[x=%s, y=%s]", x, y);
     *     }
     *
     *     public boolean equals(Object o) {
     *         ...
     *     }
     *     public int hashCode() {
     *         ...
     *     }
     * }
     */
}
