package com.hainiu.oop3;

public abstract class player extends Person{
    private int level;

    public player() {
    }

    public player(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public abstract void train();
}
