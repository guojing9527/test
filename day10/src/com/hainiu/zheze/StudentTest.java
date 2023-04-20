package com.hainiu.zheze;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名：");
        String name = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        while (true){
            try {
                System.out.println("年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
