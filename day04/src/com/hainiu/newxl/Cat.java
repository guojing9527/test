package com.hainiu.newxl;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void attack() {
        System.out.println("猫挠");
    }
}
