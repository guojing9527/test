package com.hainiu.test;

import java.text.BreakIterator;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        1. 键盘录入一个年份，判断这个年份是否是闰年
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int i = sc.nextInt();
        if (i % 4 == 0 && i % 100 !=0 || i % 400 ==0){
            System.out.println("输入的年份为闰年");

        }else {
            System.out.println("输入的年份为平年");
        }

    }
}
