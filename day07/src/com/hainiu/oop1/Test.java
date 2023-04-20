package com.hainiu.oop1;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("加菲猫");
        c.setColor("橘黄色");
        System.out.println(c.getName());
        System.out.println(c.getColor());
        c.eat();
        c.drink();
        System.out.println("-------");
        Dog d = new Dog("小米","棕色");
        System.out.println(d.getName());
        System.out.println(d.getColor());
        d.eat();
        d.drink();
    }
}
