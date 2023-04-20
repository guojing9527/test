package com.hainiu.oop1;

public class Test {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("大海在召唤，听是海哭的声音");
            }
        });

    }
    public static void goSwimming (Swimming swimming){
        swimming.swim();
    }
}
