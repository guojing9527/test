package com.hainiu.fuxi;

import com.hainiu.fuxi.Fu;

public class Zi extends Fu implements Inter{
    public Zi() {
    }

    @Override
    public void eat() {
        System.out.println("吃烧鸡，烤鸭，喝啤酒加冰");
    }

    @Override
    public void play() {
        System.out.println("让我们一起嗨起来，嗨嗨嗨");
    }
}
