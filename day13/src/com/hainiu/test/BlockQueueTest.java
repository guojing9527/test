package com.hainiu.test;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockQueueTest {

    public static void main(String[] args) {
        ArrayBlockingQueue<Object> b = new ArrayBlockingQueue<>(1);
        Producer producer = new Producer(b);
        Consumer consumer = new Consumer(b);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
