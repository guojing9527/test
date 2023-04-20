package com.hainiu.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo02Server {
    public static void main(String[] args) throws IOException {
        int port = 8848;
        ServerSocket serverSocket = new ServerSocket(port);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(0,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            Socket socket = serverSocket.accept();
            pool.execute(new Demo02Thread(socket));
        }
    }
}
