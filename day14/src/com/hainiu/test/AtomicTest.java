package com.hainiu.test;

import java.util.concurrent.atomic.AtomicInteger;

// 变量自增的测试
public class AtomicTest {

    // volatile不能保证原子性
//    private static volatile int num = 0;
    private static AtomicInteger num = new AtomicInteger();


    public static void main(String[] args) throws InterruptedException {

        // 开启10条线程，每条线程将变量自增1万次
        Runnable r = () -> {
            for (int j = 0; j < 10000; j++) {
//                num++;
                num.getAndIncrement();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }

        // 等待线程执行完毕，获取累加后的值
        Thread.sleep(1000);
        System.out.println(num);
    }
}