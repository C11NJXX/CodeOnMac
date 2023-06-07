package main.java.learn.date.June2023.th7.demo2;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer(3);
        Outer.Inner oi = o.new Inner();
        oi.hello();

    }
    static class Outer {
        private int id;
        Outer(int id) {
            this.id = id;
        }
        void method() {
            System.out.println(id);
        }

        class Inner {
            void hello() {
                method();
                System.out.println("Outer.id = " + Outer.this.id);
            }
        }
    }
}
