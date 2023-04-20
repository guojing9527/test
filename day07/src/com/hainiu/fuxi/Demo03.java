package com.hainiu.fuxi;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入空瓶子的个数：");
        int i = sc.nextInt();
        int num = i/2;
        System.out.println("可以喝："+num+"瓶饮料");

    }
}
