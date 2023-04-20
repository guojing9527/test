package com.hainiu.zu;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //建立数组
        int [] arr = new int[5];
        //循环把键盘录入的数据打印在数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第"+ (i+1)+"个整数，"+"共计有"+arr.length+"个");
            arr[i] = sc.nextInt();
        }
        //确立一个计数器
        int sum = 0;
        //求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //输出结果
        System.out.println(sum);
    }
}
