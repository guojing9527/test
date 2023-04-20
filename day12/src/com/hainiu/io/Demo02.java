package com.hainiu.io;

import java.io.File;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        File f = new File ("day12\\bbb");
//        System.out.println(f.createNewFile());
//        System.out.println(f.delete());
        System.out.println(f.mkdir());
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
    }
}
