package com.hainiu.test;

import java.util.HashSet;

public class Demo03 {
    public static void main(String[] args) {
//        3、HashSet 存储几个学生对象，要求如果对象的所有属性都相同就认为是重复。并遍历结果。
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("张三", 18));
        hashSet.add(new Student("李四", 19));
        hashSet.add(new Student("王五", 18));
        hashSet.add(new Student("赵六", 28));
        hashSet.add(new Student("张三", 18));
        hashSet.add(new Student("王五", 18));
        hashSet.forEach(s -> System.out.println(s));
    }
}
