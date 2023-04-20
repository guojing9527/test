package com.hainiu.oop2;

public class Circle extends Graph {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override

    public double getArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double getAPerimeter() {
        return Math.PI * radius *2;
    }
}
