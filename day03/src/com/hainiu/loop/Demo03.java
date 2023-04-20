package com.hainiu.loop;

public class Demo03 {
    public static void main(String[] args) {
//        珠峰的高度为8844430毫米，纸的厚度位0.1毫米折几次能超过珠峰；
//        定义三个变量
        double zf = 8844430;
        double paper = 0.1;
//        计数器
        int count = 0;
        while (paper <= zf) {
            paper *= 2;
            count++;
        }
//        输出结果
        System.out.println(count);
    }
}
