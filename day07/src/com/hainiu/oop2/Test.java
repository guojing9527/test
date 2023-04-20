package com.hainiu.oop2;

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,2);
        System.out.println(r.getArea());
        System.out.println(r.getAPerimeter());
        Circle c = new Circle(1.5);
        System.out.println(c.getArea());
        System.out.println(c.getAPerimeter());
    }
}
