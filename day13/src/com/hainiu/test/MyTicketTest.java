package com.hainiu.test;

public class MyTicketTest {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket);
        Thread t2 = new Thread(myTicket);
        t1.start();
        t2.start();
    }
}
