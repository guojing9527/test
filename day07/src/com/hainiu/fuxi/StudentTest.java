package com.hainiu.fuxi;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("韩信",18,"0001");
        Student s2 = new Student("李信",18,"0002");
        Student s3 = new Student("李白",18,"0003");
        System.out.println(s1.getName()+"\t"+s1.getAge()+"\t"+s1.getNumber());
        System.out.println(s2.getName()+"\t"+s2.getAge()+"\t"+s2.getNumber());
        System.out.println(s3.getName()+"\t"+s3.getAge()+"\t"+s3.getNumber());

    }
}
