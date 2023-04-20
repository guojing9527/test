package com.hainiu.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String data = "鸡哥救我";
        byte[] bytes = data.getBytes();
        InetAddress address =  InetAddress.getByName("192.168.62.119");
        int port = 10010;
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,port);
        socket.send(packet);
        socket.close();
    }
}
