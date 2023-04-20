package com.hainiu.zhouce;

public class MathTeacher extends Teacher{
    @Override
    public void teach() {
        System.out.println("我是教数学的");
    }

    public MathTeacher() {
    }

    public MathTeacher(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }
    /* 2、定义一个数学教师类MathTeacher，由Teacher类衍生出来。
    重写父类的抽象方法teach()，输出"我是教数学的"。*/

}
