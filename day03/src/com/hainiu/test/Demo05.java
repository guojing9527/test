package com.hainiu.test;

public class Demo05 {
    public static void main(String[] args) {
       /* 小智买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。
        请编写程序帮助小智计算一下，一年（一年52周）之后，他的存钱罐中有多少钱？*/
        int sum = 0;
        int week =10;
        for (int i = 0; i < 52; i++) {
            sum += week;
            week += 10;

        }
        System.out.println(sum);
    }
}
