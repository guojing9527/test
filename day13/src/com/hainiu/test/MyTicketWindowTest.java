package com.hainiu.test;

public class MyTicketWindowTest {
    public static void main(String[] args) {
        MyTicketWindow myTicketWindow = new MyTicketWindow();
        Thread t1 = new Thread(myTicketWindow,"tom");
        Thread t2 = new Thread(myTicketWindow,"jerry");
        t1.start();
        t2.start();

    }
}
