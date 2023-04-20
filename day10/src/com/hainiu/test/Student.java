package com.hainiu.test;

public class Student {
    private String name;
    private int age;

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
        if (age >= 18 && age <= 40){
            this.age = age;
        }else {
            throw new AgeOutOfBoundsException("age must be between 18 and 40");
        }
    }
}
