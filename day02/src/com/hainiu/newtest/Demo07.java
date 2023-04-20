package com.hainiu.newtest;

public class Demo07 {
    public static void main(String[] args) {
        /*7、小牛买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。
        请编写程序帮助小牛计算一下，一年（一年52周）之后，他的存钱罐中有多少钱？*/
        //定义变量
        int week = 10;
        int all = 0;
        // 循环累加
        for (int i = 0; i < 52; i++) {
            all += week;
            week += 10;
        }
        System.out.println(all);
    }
}
