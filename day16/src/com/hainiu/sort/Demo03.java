package com.hainiu.sort;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo03 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("127.01.01");
        System.out.println(byName);
    }
}
