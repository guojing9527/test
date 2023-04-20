package com.hainiu.oop3;

public class BasketballPlayer extends player{
    @Override
    public void train() {
        System.out.println("篮球运动员练习篮球");
    }

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age, int level) {
        super(name, age, level);
    }
}
