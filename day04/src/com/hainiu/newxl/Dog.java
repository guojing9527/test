package com.hainiu.newxl;

public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void attack() {
        System.out.println("狗咬");
    }
}
