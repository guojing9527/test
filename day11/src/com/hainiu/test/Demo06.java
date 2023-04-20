package com.hainiu.test;

import java.util.HashMap;

/*
 "java world java javase big big data data data java hello world hello"
*/
public class Demo06 {
    public static void main(String[] args) {
        String str = "java world java javase big big data data data java hello world hello";
        String[] split = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : split) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        map.forEach((k,v) -> System.out.println("单词" + k + "出现了" + v + "次"));
    }
}
