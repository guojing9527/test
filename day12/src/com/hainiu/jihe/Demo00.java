package com.hainiu.jihe;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo00 {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("hello");
        s.add("world");
        System.out.println(s);
        System.out.println(s.get(0));
        s.forEach(s1 -> System.out.println(s1));
        for (String s2 : s) {
            System.out.println(s2);
        }
    }
}
