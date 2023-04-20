package com.hainiu.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
//        1、定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）
        ArrayList<String>  list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------");
        list.forEach(s -> System.out.println(s));
    }
}
