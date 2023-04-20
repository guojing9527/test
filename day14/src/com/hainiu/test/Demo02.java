package com.hainiu.test;

import java.util.concurrent.ConcurrentHashMap;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);
        // 遍历
        for (int i = 1; i <= 20; i++) {
            System.out.println(map.get(i+""));
        }
    }
}
