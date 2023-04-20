package com.hainiu.jihe;

import java.util.LinkedList;

public class Demo01 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<String>();
        s.add("1");
        s.addLast("2");
        System.out.println(s.size());
        System.out.println(s);
        s.removeFirst();
        System.out.println(s.size());
        System.out.println(s);
    }
}
