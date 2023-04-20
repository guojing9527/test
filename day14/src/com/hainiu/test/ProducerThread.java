package com.hainiu.test;

public class ProducerThread extends Thread {

    private Object lock;

    // 在构造方法中接收一个锁对象
    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        // 不停的生产
        while (true) {
            synchronized (lock) {
                // 判断有没有产品
                if (!"".equals(ProducerAndConsumer.product)) {
                    // 有就等待
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 判断没有产品，或者消费者消费完产品，唤醒了生产线程
                // 生产一个产品
                ProducerAndConsumer.product = System.currentTimeMillis() + "";
                System.out.println("生产者" + Thread.currentThread().getName() + "生产了一个产品：" + ProducerAndConsumer.product);
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
