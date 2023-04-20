package com.hainiu.test;

import java.io.*;
import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();


    }

    private static void read() throws IOException, ClassNotFoundException {
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day12\\str.txt"));
       /* Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());*/
        Object obj = ois.readObject();
        ArrayList<Student> arrayList = (ArrayList<Student>) obj;
        ois.close();
        for (Student s : arrayList) {
            System.out.println(s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }

    private static void write() throws IOException {
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12\\str.txt"));
     /*  Student student1 = new Student("tom",28,"123");
       Student student2 = new Student("jerry",22,"111");
       oos.writeObject(student1);
       oos.writeObject(student2);*/
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student s1 = new Student("tom", 28, "123");
        Student s2 = new Student("jerry", 22, "111");
        arrayList.add(s1);
        arrayList.add(s2);
        oos.writeObject(arrayList);
        oos.close();
    }
}
