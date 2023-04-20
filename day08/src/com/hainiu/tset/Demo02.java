package com.hainiu.tset;

public class Demo02 {
    /*讲义中3个lambda表达式的练习
            要求两种方式实现
    匿名内部类和lambda表达式*/
    public static void main(String[] args) {
        useEat(new Eat() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });
        useEat(() -> System.out.println("一天一苹果，医生远离我"));

    }
    public static void useEat(Eat e){
        e.eat();
    }
}
