package com.hainiu.newtest;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        1、三元运算符获取三个数的最大值
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        // 获取第一整数
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        // 获取第二整数
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        // 获取第三整数
        int c = sc.nextInt();
        // 比较大小
        int temp = a > b ? a : b ;
        int max = temp > c ? temp : c;
        //输出结果
        System.out.println(max);
    }
}
