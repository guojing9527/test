package com.hainiu.jihe;

import java.util.Comparator;
import java.util.TreeSet;

public class TeacherTest {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<Teacher>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
                //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Teacher t1 = new Teacher("tom",20);
        Teacher t2 = new Teacher("jerry",27);
        Teacher t3 = new Teacher("tom",20);
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        for (Teacher t : ts) {
            System.out.println(t);
        }
    }
}
