package com.hainiu.lianxi;

import java.util.LinkedList;

public class Doo1 implements Runnable{
    private  LinkedList<String> list;

    public Doo1(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            if (list.isEmpty()) {
                break;
            }
            synchronized (list) {
                if (list.size()>0){
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
