package com.hainiu.jihe;

import java.io.DataOutput;
import java.util.HashSet;

public class Demo02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        set.add("111");
        System.out.println(set.size());
        set.remove("111");
        System.out.println(set);
//        set.forEach(s -> System.out.println(s));
        for (String s : set) {
            System.out.println(s);
        }
    }
}
