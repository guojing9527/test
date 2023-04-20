package com.hainiu.newxl;

public class PetTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("汤姆");
        cat.setColor("蓝色");
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        cat.attack();
        Dog dog = new Dog("斯派克","白色");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        dog.attack();
    }
}
