package com.hainiu.jihe;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo04 {
    public static void main(String[] args) {

        // 创建TreeMap集合对象
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                //次要条件，按照姓名排序。
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        // 创建学生对象
        Student s1 = new Student("xiaohei", 23);
        Student s2 = new Student("dapang", 22);
        Student s3 = new Student("xiaomei", 22);

        // 将学生对象添加到TreeMap集合中
        tm.put(s1, "上海");
        tm.put(s2, "北京");
        tm.put(s3, "天津");

        // 遍历TreeMap集合,打印每个学生的信息
        tm.forEach(
                (Student key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
