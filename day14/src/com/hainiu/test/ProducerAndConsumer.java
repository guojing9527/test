package com.hainiu.test;

public class ProducerAndConsumer {
    // 定义一个可以消费的产品 -- 有没有产品的标识
    public static String product = "";
    public static void main(String[] args) {
        // 创建一个锁对象
        Object obj = new Object();

        new ProducerThread(obj).start();
        new ConsumerThread(obj).start();
    }
}