package com.hainiu.load;

import java.lang.reflect.Field;

public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.load.Student");
        Student student = clazz.getDeclaredConstructor().newInstance();
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
       nameField.set(student,"tom");
        Object v1 = nameField.get(student);
        System.out.println(v1);
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(student,18);
        Object v2 = ageField.get(student);
        System.out.println(v2);
        System.out.println(student);
    }
}
