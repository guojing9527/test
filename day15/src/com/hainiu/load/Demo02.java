package com.hainiu.load;

import java.lang.reflect.Constructor;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.load.Student");
        // 获取一个公共构造
        Constructor<Student> constructor1 = clazz.getConstructor(String.class,int.class);
        System.out.println(constructor1);
        Student student = constructor1.newInstance("tom", 23);
        System.out.println(student);
        // 获取一个非公共构造
        Constructor<Student> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        Student student1 = declaredConstructor.newInstance("tom");
        System.out.println(student1);
    }
}
