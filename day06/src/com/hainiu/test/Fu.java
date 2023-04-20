package com.hainiu.test;

public class Fu {
    private String name;
    private int age;

    public Fu() {
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show (){
        System.out.println("我既是黑夜");
    }
}
