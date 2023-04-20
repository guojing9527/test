package com.hainiu.test;

import java.beans.Visibility;
import java.util.LinkedList;

public class Doo implements Runnable {
    private volatile LinkedList<String> list;

    public Doo(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (list.size() > 0) {
            synchronized (Doo.class) {
                if (list.size() > 0) {
                    String s = list.removeFirst();
                    System.out.println(Thread.currentThread().getName() + s);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
