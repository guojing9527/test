package com.hainiu.jihe;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo03 {
    public static void main(String[] args) {
        HashSet<Student> s = new HashSet<>();
        //创建学生对象
        Student s1 = new Student("张三", 30);
        Student s2 = new Student("李四", 35);
        Student s3 = new Student("王五", 33);
        Student s4 = new Student("王五", 33);

        //把学生添加到集合
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        for (Student student : s) {
            System.out.println(student.getName());
        }
    }
}
