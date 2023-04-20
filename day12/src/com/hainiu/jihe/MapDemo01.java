package com.hainiu.jihe;

import java.util.*;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
//        map.remove("杨过");

        //输出集合对象
        System.out.println(map);
        map.forEach((k, v)  -> System.out.println(k + "=" + v));
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键。用增强for实现
        for (String key : keySet) {
            //根据键去找值。用get(Object key)方法实现
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}