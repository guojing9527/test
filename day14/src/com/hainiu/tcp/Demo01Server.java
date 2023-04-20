package com.hainiu.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01Server {
    public static void main(String[] args) throws IOException {
        int port = 8848;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        FileOutputStream out = new FileOutputStream("day14\\src\\upload\\R.jpg");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes))!= -1) {
            out.write(bytes, 0, len);
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("文件上传成功");
        writer.newLine();
        writer.flush();
        out.close();
    }
}
