package com.hainiu;

public class Demo05 {
    private int age;
    private String name;

    public Demo05() {
        System.out.println("构造方法执行了");
    }

    public Demo05(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
