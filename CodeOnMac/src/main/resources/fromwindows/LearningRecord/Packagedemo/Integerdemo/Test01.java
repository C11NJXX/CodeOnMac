package main.resources.fromwindows.LearningRecord.Packagedemo.Integerdemo;

public class Test01 {
    public static void main(String[] args) {
        //constructor
        Integer i1 = Integer.valueOf(3);
        Integer i2 = Integer.valueOf("3");
        System.out.println(i1);
        System.out.println(i2);
        Integer i3 = Integer.valueOf(3);
        Integer i4 = Integer.valueOf(3);

        Integer integer = Integer.valueOf(100);
        String s = Integer.toBinaryString(100);
        System.out.println(s);
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
    }
}
