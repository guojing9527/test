package com.hainiu.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Demo02Client {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\86151\\Desktop\\R-C.jpg");
        Socket socket = new Socket(InetAddress.getByName("127.1.1"),8848);
        OutputStream out = socket.getOutputStream();
        byte[] buffer = new byte[8192];
        int len;
        while((len = in.read(buffer))!=-1){
            out.write(buffer,0,len);
            out.flush();
        }
        socket.shutdownOutput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);
        in.close();
        socket.close();
    }
}
