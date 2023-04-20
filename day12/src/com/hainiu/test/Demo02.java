package com.hainiu.test;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\mn.txt", true));
        bw.write("aaaa");
        bw.newLine();
        bw.write("bbbb");
//        bw.flush();
        bw.close();
        BufferedReader fr = new BufferedReader(new FileReader("day12\\mn.txt"));
        String len;
        while ((len = fr.readLine())!= null) {
            System.out.println(len);
        }
        fr.close();
    }
}
