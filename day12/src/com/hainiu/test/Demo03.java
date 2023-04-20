package com.hainiu.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
//        掌握缓冲字符流写出字符串和换行符的方法
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\mn.txt", true));
        bw.write("aaaa");
        bw.newLine();
        bw.write("bbbb");
//        bw.flush();
        bw.close();
    }
}
