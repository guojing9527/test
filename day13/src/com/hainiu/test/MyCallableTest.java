package com.hainiu.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask f1 = new FutureTask(myCallable);
        Thread t1 = new Thread(f1);
        t1.start();
        FutureTask f2 = new FutureTask(myCallable);
        Thread t2 = new Thread(f2);
        t2.start();
        Object obj1 = f1.get();
        System.out.println(obj1);
        Object obj2 = f2.get();
        System.out.println(obj2);
    }
}
