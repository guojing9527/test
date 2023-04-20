package com.hainiu.oop3;

public class PingPongPlayer extends player implements SayEnglish{
    @Override
    public void train() {
        System.out.println("乒乓运动员练习乒乓球");
    }

    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age, int level) {
        super(name, age, level);
    }

    @Override
    public void sayEnglish() {
        System.out.println("乒乓运动员学习英文");
    }
}
