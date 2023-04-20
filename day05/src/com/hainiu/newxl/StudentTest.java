package com.hainiu.newxl;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("tom", 19);
        Student s2 = new Student("tom", 19);
        System.out.println(s1.equals(s2));
    }
}
