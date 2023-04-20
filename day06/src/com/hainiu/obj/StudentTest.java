package com.hainiu.obj;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        s.name ="李太白";
        System.out.println(s.age);
        System.out.println(s.name);
        s.eat();
        s.study();
        s.play();
    }
}
