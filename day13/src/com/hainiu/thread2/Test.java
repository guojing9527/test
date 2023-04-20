package com.hainiu.thread2;

public class Test {
    public static void main(String[] args) {
        MyTicket ticket = new MyTicket();
        Thread t1 = new Thread(ticket,"tom");
        Thread t2 = new Thread(ticket,"jerry");
        t1.start();
        t2.start();
    }
}
