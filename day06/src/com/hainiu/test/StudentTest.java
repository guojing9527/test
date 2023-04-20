package com.hainiu.test;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("青莲剑仙");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println("--------");
        Student s1 = new Student("李白",18);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
