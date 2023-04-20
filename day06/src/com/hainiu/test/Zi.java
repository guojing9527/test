package com.hainiu.test;

public class Zi extends Fu{
    private double height;

    public Zi() {
    }

    public Zi(String name, int age, double height) {
        super(name, age);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("我就是太阳");
    }
}
