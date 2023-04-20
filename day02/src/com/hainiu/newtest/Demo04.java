package com.hainiu.newtest;

public class Demo04 {
    public static void main(String[] args) {
//        4、折纸超过珠峰
        // 定义变量
        double zf = 8848400;
        double paper = 0.1;
        // 定义计数器
        int count = 0;
        // 循环
        while (paper <= zf){
            paper *= 2;
            count++;
            System.out.println(paper);
        }
        //输出结果
        System.out.println(count);
    }
}
