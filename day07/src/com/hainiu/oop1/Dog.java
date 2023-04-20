package com.hainiu.oop1;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }
}
