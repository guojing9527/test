package com.hainiu.thread;

public class MyTicket implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
              break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在售出"+ticket+"张票");
            ticket--;
        }
    }
}
