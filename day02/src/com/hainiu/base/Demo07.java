package com.hainiu.base;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个学生身高：");
        int a = sc.nextInt();
        System.out.println("请输入第二个学生身高：");
        int b = sc.nextInt();
        System.out.println("请输入第三个学生身高：");
        int c = sc.nextInt();
        int t = a > b ? a : b;
        int max = t > c ? t : c;
        System.out.println("学生的最大身高是：" + max);

    }
}
