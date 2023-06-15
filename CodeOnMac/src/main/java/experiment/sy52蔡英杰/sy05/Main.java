package main.java.experiment.sy52蔡英杰.sy05;


//（1）Shape.java文件，在该文件中定义接口Shape，该接口在shape包中。
//        属性：PI。
//        方法：求面积的方法area()。


interface Shape {
    public static double PI = Math.PI;

    public abstract double getArea();
}

//（2）Circle.java文件，在该文件中定义圆类Circle，该类在circle包中，实现Shape接口。
//属性：圆半径radius。
//方法：构造方法；实现接口中求面积方法area()；求周长方法perimeter()。


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Circle.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Circle.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

//（3）“Cylinder.java”文件，在该文件中定义圆柱体类Cylinder，该类口在cylinder包中，继承圆类。
//属性：圆柱体高度height。
//方法：构造方法；求表面积方法area()；求体积方法volume()。
class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double Area() {
        return super.getArea() * 2 + 2 * Circle.PI * getRadius() * height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


//（4）Main.java文件，在该文件中定义主类Main，该类在默认包中，其中包含主方法main()，
//在主方法中创建两个圆类对象cir1和cir2，
//具体尺寸自己确定，并显示圆的面积和周长；
//再创建两个圆柱体类的对象cy1和cy2，具体尺寸自己确定，
//然后分别显示圆柱体cy1和cy2的底圆的面积和周长以及它们各自的体积和表面积
public class Main {
    public static void main(String[] args) {
        Circle cir1 = new Circle(3);
        Circle cir2 = new Circle(4);
        System.out.println(cir1.getArea());
        System.out.println(cir2.getArea());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir2.getPerimeter());
        Cylinder cy1 = new Cylinder(3, 5);
        Cylinder cy2 = new Cylinder(4, 5);
        System.out.println(cy1.Area());
        System.out.println(cy2.Area());
        System.out.println(cy1.getPerimeter());
        System.out.println(cy2.getPerimeter());
        System.out.println(cy1.getArea());
        System.out.println(cy2.getArea());
        System.out.println(cy1.getVolume());
        System.out.println(cy2.getVolume());
    }
}
