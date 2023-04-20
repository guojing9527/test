package com.hainiu.test;

import java.io.File;

public class Demo04 {
    //        文件删除
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86151\\Desktop\\aaa.md");
        deleteDir(file);

    }
    public static void deleteDir(File dir) {
        // 如果文件表示的路径不存在
        if (!dir.exists()) {
            return;
        }
        // 如果是一个文件 直接删
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        // 文件夹
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是文件 删除
                if (file.isFile()) {
                    file.delete();
                } else {
                    // 如果是文件夹 递归
                    deleteDir(file);
                }
            }
            // 循环结束 说明当前文件夹下面的子内容删除 删除这个空文件夹
            dir.delete();
        }
    }
}
