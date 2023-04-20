package com.hainiu.swim;

public class SwimmingTest {
    public static void main(String[] args) {
        getSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁, 我们去游泳吧");
            }
        });
    }

    public static void getSwimming(Swimming swimming) {
        swimming.swim();
    }
}
