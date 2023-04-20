package com.hainiu.oop1;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("小猫要吃千层面");
    }

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }
}
