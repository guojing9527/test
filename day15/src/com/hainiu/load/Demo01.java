package com.hainiu.load;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.load.Student");
        System.out.println(clazz);

        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);
        System.out.println(clazz2 == clazz);

        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
        System.out.println(clazz3);
        System.out.println(clazz3 == clazz2);
        System.out.println(clazz == clazz3);


    }
}
