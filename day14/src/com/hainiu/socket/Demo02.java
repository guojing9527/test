package com.hainiu.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        int port = 8848;
        DatagramSocket socket = new DatagramSocket(port);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        while (true){
            socket.receive(packet);
            int len = packet.getLength();
            String s = new String(buffer, 0, len);
            String h = packet.getAddress().getHostName();
            System.out.println(h+"说："+s);
        }
    }
}
