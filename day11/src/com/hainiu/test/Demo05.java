package com.hainiu.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo05 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("许仙", "白娘子");
        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("范喜良", "孟姜女");
        map.forEach((k,v) -> System.out.println(k + "=" + v));
        System.out.println("-------");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String v = map.get(key);
            System.out.println(key + "=" + v);
        }
        System.out.println("--------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry :entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println( key + "=" + value);
        }
    }
}
