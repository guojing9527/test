package com.hainiu.fuxi;

import com.hainiu.fuxi.Zi;

public class Test {
    public static void main(String[] args) {
        Zi d = new Zi();
        d.show();
        d.eat();
        d.play();
        fu(new Fu() {
            @Override
            public void eat() {
                System.out.println("干饭人，干饭魂，干饭人都是人上人。");
            }
        });
        fu(new Zi());
        goPlay(new Inter() {
            @Override
            public void play() {
                System.out.println("吃饱喝足来把福星");
            }
        });
    }

    public static void fu (Fu fu){
        fu.eat();
    }
    private static void goPlay(Inter inter){
        inter.play();
    }
}
