package com.hainiu.tset;

public class Demo03 {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        useFlyable((String s)-> {
            System.out.println(s);
            System.out.println("飞机自驾游");
        });

    }
    public static void useFlyable(Flyable f){
        f.fly("开飞机呜呜呜");
    }
}
