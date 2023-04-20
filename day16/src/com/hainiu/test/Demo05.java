package com.hainiu.test;

import java.io.File;

public class Demo05 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86151\\Desktop\\aaa.md");
        long l = addDir(file);
        System.out.println(l);

    }

    public static long addDir(File add) {
        long chang = 0;
        // 如果文件表示的路径不存在
        if (!add.exists()) {
            return -1;
        }
        // 如果是一个文件
        if (add.isFile()) {
            chang = add.length();
            return chang;
        }
        // 文件夹
        File[] files = add.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件
                if (file.isFile()) {
                    chang += file.length();
                } else {
                    // 如果是文件夹 递归
                   chang += addDir(file);
                }
            }
        }
        return chang;
    }
}
