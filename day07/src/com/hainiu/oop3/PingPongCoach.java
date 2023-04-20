package com.hainiu.oop3;

public class PingPongCoach extends Coach implements SayEnglish{
    @Override
    public void train() {
        System.out.println("乒乓教练要教打乒乓");
    }

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayEnglish() {
        System.out.println("乒乓教练学习英文");
    }

}
