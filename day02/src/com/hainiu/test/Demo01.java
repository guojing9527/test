package com.hainiu.test;

public class Demo01 {
    /*1. 已知小红同学有25元，她攒了几天钱之后发现现在的钱比原来的2倍还多出10块。
    而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
    于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？
*/
    public static void main(String[] args) {
        //定义两个变量
        int h = 25 * 2 + 10;
        int l = 30 * 2;
        System.out.println(h == l);
    }
}