package main.java.learn.date.June2023.th7.demo2;

public class Test1 {
    public static void main(String[] args) {
         Outer.swimming();

    }
    class Outer {
        private static int ID = 3;
        private int id;
        Outer(int id) {
            this.id = id;
        }
        private void method() {
            System.out.println("1");
        }

        static void swimming() {
            Swim swim = new Swim() {
                @Override
                public void swimming() {
                    System.out.println("implements swimming through anonymous inner class");
                }
            };
            swim.swimming();
        }
    }

}
