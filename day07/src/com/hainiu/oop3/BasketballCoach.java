package com.hainiu.oop3;

public class BasketballCoach extends Coach{
    @Override
    public void train() {
        System.out.println("篮球教练要教篮球");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
