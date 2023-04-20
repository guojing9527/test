package com.hainiu.test;

public class ConsumerThread extends Thread {

    private Object lock;

    // 在构造方法中接收一个锁对象
    public ConsumerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // 不停的消费
        while (true) {
            synchronized (lock) {
                // 判断有没有产品
                if ("".equals(ProducerAndConsumer.product)) {
                    // 没有就等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 判断有产品，或者生产者生产完产品，唤醒了消费线程
                // 消费一个产品
                System.out.println("消费者" + Thread.currentThread().getName() + "消费了一个产品：" + ProducerAndConsumer.product);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                // 唤醒等待的线程 -- 唤醒消费者消费
                lock.notifyAll();
            }
        }
    }
}
