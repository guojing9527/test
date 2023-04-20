package com.hainiu.newlx;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二整数：");
        int e = sc.nextInt();
        System.out.println("请输入第三整数：");
        int s = sc.nextInt();
        int t = i > e ? i : e;
        int max = t > s ? t :s;
        System.out.println(max);
    }
}
