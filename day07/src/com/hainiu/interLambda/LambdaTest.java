package com.hainiu.interLambda;

public class LambdaTest {
    public static void main(String[] args) {
        //匿名内部类
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("大海在召唤我们");
            }
        });
        //lambda表达式
        goSwimming(() -> System.out.println("大海在召唤我们"));
    }
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
